package com.karthyks.plugin

object Projects {
    val network = Network
    val common = Common
    val navigation = Navigation
    val search = Search
    val searchDetails = SearchDetails

    object Navigation {
        const val homeNavigation = "com.karthyks.dice.android.navigation:home-navigation"
    }

    object Search {
        const val searchPresentation = "com.karthyks.dice.android.search:search-presentation"
    }

    object SearchDetails {
        const val searchDetailsPresentation =
            "com.karthyks.dice.android.search-details:search-details-presentation"
    }

    object Common {
        const val coroutinesAnnotation = "com.karthyks.dice.common:coroutines-annotation"
        const val coroutinesProvider = "com.karthyks.dice.android.common:coroutines-provider"
        const val testFramework = "com.karthyks.dice.android.common:test-framework"
        const val composeTestContract = "com.karthyks.dice.common:compose-test-contract"
    }

    object Network {
        const val networkDI = "com.karthyks.dice.network:network-di"
        const val musicBrainzService = "com.karthyks.dice.network:music-brainz-service"
        const val musicEntities = "com.karthyks.dice.network:music-entities"
        const val networkConfig = "com.karthyks.dice.network:network-config-provider"
        const val testClient = "com.karthyks.dice.network:test-http-client"
        const val httpClient = "com.karthyks.dice.network:http-client"
    }
}
