package com.karthyks.dice.test.httpclient

import java.util.concurrent.TimeUnit
import okhttp3.mockwebserver.Dispatcher
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import okhttp3.mockwebserver.RecordedRequest
import org.skyscreamer.jsonassert.JSONAssert

/**
 * Class to manage and interact with an instance of [MockWebServer].
 * It will create a mock server and dispatch requests to it that have been enqueued using [MockServer.enqueue].
 */
class MockServer : ApiDispatcher {
    private val fileReader = FileReader()
    private val mockWebServer = MockWebServer()
    override val url: String
        get() = mockWebServer.url("/").toString()
    override val requestBody: String
        get() = mockWebServer.takeRequest().body.readUtf8()
    override val requestUrlPath: String
        get() = mockWebServer.takeRequest().path.orEmpty()

    fun start(port: Int = 0) {
        runCatching {
            mockWebServer.start(port)
            println("$this started mock webserver $url")
        }.onFailure { exception ->
            println("failed to start mock web server ${exception.stackTraceToString()}")
            exception.printStackTrace()
        }
    }

    fun shutdown() {
        runCatching {
            mockWebServer.shutdown()
            println("$this mock web server shutdown")
        }.onFailure { exception ->
            println("failed to shutdown mock web server")
            exception.printStackTrace()
        }
    }

    override fun enqueue(filePath: String, responseCode: Int) {
        val response = MockResponse()
            .setResponseCode(responseCode)
            .setBody(fileReader.read(filePath))
        mockWebServer.enqueue(response)
    }

    override fun enqueue(delay: Long, vararg responseBody: ResponseBody.Success) {
        responseBody.forEach {
            val response = MockResponse()
                .setResponseCode(200)
                .setBody(fileReader.read(it.fileName))
                .setBodyDelay(delay, TimeUnit.MILLISECONDS)
            mockWebServer.enqueue(response)
        }
    }

    override fun enqueue(vararg responseBody: ResponseBody.Success) {
        enqueue(delay = 0L, responseBody = responseBody)
    }

    override fun clear() {
        mockWebServer.dispatcher = object : Dispatcher() {
            override fun dispatch(request: RecordedRequest): MockResponse {
                return MockResponse().setResponseCode(404)
            }
        }
    }

    override fun setMockResponse(requestBody: RequestBody?, responseBody: ResponseBody?) {
        mockWebServer.dispatcher = object : Dispatcher() {
            override fun dispatch(request: RecordedRequest): MockResponse {
                if (requestBody != null) {
                    val reqBody = request.body.readUtf8()
                    if (reqBody.isNotBlank()) {
                        JSONAssert.assertEquals(
                            /* message = */ "Request body mismatch",
                            /* expectedStr = */ reqBody,
                            /* actualStr = */ fileReader.read(requestBody.fileName),
                            /* strict = */ false
                        )
                    }
                }
                return when (val response = responseBody) {
                    null -> MockResponse().setResponseCode(404)
                    ResponseBody.Error -> MockResponse().setBody(fileReader.read("response/error_body.json"))
                    is ResponseBody.Success -> {
                        val responseBodyString = fileReader.read(response.fileName)
                        MockResponse().setResponseCode(200)
                            .setBody(responseBodyString)
                    }
                }
            }
        }
    }
}
