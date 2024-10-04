package com.example.appvm.service

import com.example.appvm.model.CreditCardResponse
import retrofit2.http.GET

interface ApiService {
    @GET("credit_cards")
    suspend fun getCreditCards():CreditCardResponse
}