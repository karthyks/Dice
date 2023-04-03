package com.karthyks.dice.app.test.di

import androidx.test.espresso.idling.CountingIdlingResource
import com.karthyks.dice.network.helper.SafeApiCaller
import com.karthyks.dice.network.helper.SafeApiCallerImpl

class SafeApiCallerWrapper(
    private val safeApiCallerImpl: SafeApiCallerImpl,
    private val countingIdlingResource: CountingIdlingResource,
) : SafeApiCaller {
    override suspend fun <T> invoke(apiCall: suspend () -> T): Result<T> {
        countingIdlingResource.increment()
        val result = safeApiCallerImpl.invoke(apiCall)
        println("SafeApiResult $result")
        countingIdlingResource.decrement()
        return result
    }
}
