package com.karthyks.dice.test.httpclient

internal class FileReader {
    fun read(path: String): String {
        return this.javaClass.classLoader.getResourceAsStream(path)!!.bufferedReader().use {
            it.readText()
        }
    }
}
