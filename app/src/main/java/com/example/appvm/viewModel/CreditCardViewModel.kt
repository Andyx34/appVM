package com.example.appvm.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appvm.data.CreditCardRepository
import com.example.appvm.model.CreditCardResponse
import kotlinx.coroutines.launch

class CreditCardViewModel : ViewModel() {
    private val repository =CreditCardRepository()

    private val _creditCards = MutableLiveData<CreditCardResponse>()
    val creditCards: LiveData<CreditCardResponse> = _creditCards

    fun fetchCreditCards(){
        viewModelScope.launch {
            try {
                val cards = repository.getCreditCards()
                _creditCards.value = cards
                Log.e("FetchCreditCard", _creditCards.value.toString());
            } catch (e: Exception){
                Log.e("FetchCreditCard", e.message.toString());
            }
        }
    }
}