package com.karthyks.dice.test.httpclient

import com.squareup.moshi.Moshi
import kotlin.reflect.KClass
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.ResponseBody.Companion.toResponseBody
import okio.Buffer
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * Utility method to create an API service using [Retrofit].
 */
fun <T : Any> buildApiService(baseUrl: String, clazz: KClass<T>): T {
    return Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(Moshi.Builder().build()))
        .client(
            OkHttpClient.Builder()
                .addInterceptor(logInterceptor())
                .build()
        )
        .baseUrl(baseUrl)
        .build()
        .create(clazz.java)
}

private fun logInterceptor(): Interceptor = Interceptor { chain ->
    val request = chain.request()
    println("--> ${request.url}")
    println("--> [Headers]")
    request.headers.forEach { (key: String, value: String) ->
        println("--> $key: $value")
    }
    println("--> [\\Headers]")
    val requestBodyBuffer = Buffer()
    request.body?.writeTo(requestBodyBuffer)
    val body = requestBodyBuffer.use { buffer -> buffer.readUtf8() }
    println("--> [Body]")
    println("--> $body")
    println("--> [\\Body]")
    val response = chain.proceed(request)
    println("<-- ${response.request.url}")
    println("<-- [Headers]")
    request.headers.forEach { (key: String, value: String) ->
        println("--> $key: $value")
    }
    println("<-- [\\Headers]")
    val contentType = response.body?.contentType()
    val content = response.body?.string()
    println("<-- [Body]")
    println("<-- $content")
    println("<-- [\\Body]")
    response.newBuilder()
        .body(
            body = content?.toResponseBody(contentType)
        )
        .build()
}
