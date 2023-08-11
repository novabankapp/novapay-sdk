package com.novapay.sdk.platform

import java.util.*

enum class NovaPaySdkEnvironment(val baseUrl: String) {

    TST("novagateway.eastus.cloudapp.azure.com:30000"),
    PRD("novagateway.eastus.cloudapp.azure.com:30000");

    companion object {
        fun fromString(str: String) = valueOf(str.uppercase(Locale.US))
    }
}
class NovaPayPlatformCredentials{
    companion object{
        val ClientID : String = "M0bil3Sdk"
        val ClientSecret : String = "M0bil3Sdk#2023"
        val GrantType : String = "client_credentials"
    }
}