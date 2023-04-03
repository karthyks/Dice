package com.karthyks.dice.test.httpclient

sealed interface ResponseBody {
    sealed interface Success : ResponseBody {
        val fileName: String

        object ArtistDetailSuccess : Success {
            override val fileName: String = "response/artist_detail.json"
        }

        object ArtistListSuccess : Success {
            override val fileName: String = "response/artist_list.json"
        }
    }

    object Error : ResponseBody
}
