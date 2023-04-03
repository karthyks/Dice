package com.karthyks.dice.test.httpclient

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

fun jsonToMap(json: String): Map<String, Any> {
    val moshi = Moshi.Builder().build()
    val jsonAdapter: JsonAdapter<Map<String, Any>> = moshi.adapter(
        Types.newParameterizedType(
            MutableMap::class.java,
            String::class.java,
            Any::class.java
        )
    )
    return jsonAdapter.fromJson(json).orEmpty()
}
