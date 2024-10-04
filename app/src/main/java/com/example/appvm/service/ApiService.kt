package com.example.appvm.service

import com.example.appvm.model.CrediCardResponse
import com.example.appvm.model.CreditCard
import retrofit2.http.GET

interface ApiService {
    @GET("credit_cards")
    suspend fun getCreditCards():CrediCardResponse
}