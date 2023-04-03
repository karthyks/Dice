package com.karthyks.dice.network.helper

import com.squareup.moshi.Moshi
import retrofit2.HttpException
import java.io.IOException

class SafeApiCallerImpl(
    private val moshi: Moshi,
) : SafeApiCaller {

    override suspend fun <T> invoke(apiCall: suspend () -> T): Result<T> {
        return runCatching { apiCall() }.fold(
            onSuccess = Result.Companion::success,
            onFailure = { throwable ->
                when (throwable) {
                    is IOException -> Result.failure(ApiCallError.NetworkError(cause = throwable))
                    is HttpException -> {
                        val errorDetails = throwable.getErrorDetails()
                        Result.failure(
                            exception = ApiCallError.ApiError(
                                cause = Throwable(
                                    message = errorDetails.message,
                                    cause = throwable
                                ),
                                details = errorDetails
                            )
                        )
                    }
                    else -> Result.failure(ApiCallError.UnknownError(cause = throwable))
                }
            }
        )
    }

    private fun HttpException.getErrorDetails(): ApiCallError.ApiError.Details {
        val (apiCode: String?, errorMessage: String?) = getErrorBody()?.run { code to message }
            ?: (null to null)
        return ApiCallError.ApiError.Details(
            statusCode = code(),
            code = apiCode,
            message = errorMessage
        )
    }

    private fun HttpException.getErrorBody(): ApiErrorResponse? {
        return runCatching {
            val body = response()?.errorBody()?.source()
            moshi.adapter(ApiErrorResponse::class.java).fromJson(body!!)!!
        }.onFailure { error ->
            println("$error") // Better to replace with logger
        }.getOrNull()
    }
}
