package com.karthyks.dice.network.helper

sealed class ApiCallError(cause: Throwable) : Throwable(cause) {
    data class NetworkError(override val cause: Throwable) : ApiCallError(cause)
    data class ApiError(
        override val cause: Throwable,
        val details: Details
    ) : ApiCallError(cause) {
        data class Details(val statusCode: Int, val code: String?, val message: String?)
    }

    data class UnknownError(override val cause: Throwable) : ApiCallError(cause)
}
