package com.novapay.sdk.domain.remote.ktor.mock.clients

import com.google.gson.Gson
import com.novapay.sdk.data.Merchant
import com.novapay.sdk.data.MerchantCategory
import com.novapay.sdk.data.MerchantConfig
import com.novapay.sdk.data.ValidationConfig
import com.novapay.sdk.domain.models.responses.GeneralResult
import com.novapay.sdk.domain.models.responses.ValidateMerchantResponse

object ValidateMockResponse{
    operator fun invoke(): String {
        var obj = ValidateMerchantResponse(
            success = true,
            merchant = Merchant(
                name =  "St Andrews",
                recordId = 123,
                uniqueIdentifier = "1234",
                isActive = true,
                merchantCategory = MerchantCategory(
                    recordId = 1,
                    name = "Academics"
                ),
                merchantConfig = MerchantConfig(
                    validationConfig = ValidationConfig(
                        isLocal = true
                    )
                )
            )
        )
        return Gson().toJson(obj)
    }
}