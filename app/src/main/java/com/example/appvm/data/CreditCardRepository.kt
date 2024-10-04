package com.example.appvm.data

import com.example.appvm.model.CreditCardResponse
import com.example.appvm.service.RetrofitInstance

class CreditCardRepository {
    private val creditCardService = RetrofitInstance.crediCardService
    suspend fun getCreditCards(): CreditCardResponse{
        return creditCardService.getCreditCards()

    }    }