package com.karthyks.dice.network.helper

interface SafeApiCaller {
    suspend operator fun <T> invoke(apiCall: suspend () -> T): Result<T>
}
