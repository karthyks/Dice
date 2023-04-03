package com.karthyks.dice.test.httpclient

internal interface ApiDispatcher {
    val url: String
    fun enqueue(filePath: String, responseCode: Int)
    fun enqueue(delay: Long, vararg responseBody: ResponseBody.Success)
    fun enqueue(vararg responseBody: ResponseBody.Success)
    fun setMockResponse(requestBody: RequestBody?, responseBody: ResponseBody? = null)
    fun clear()
    val requestUrlPath: String
    val requestBody: String
}
