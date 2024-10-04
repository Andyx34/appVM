package com.example.appvm

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appvm.screens.CreditCardScreen
import com.example.appvm.ui.theme.AppVMTheme
import com.example.appvm.viewModel.CreditCardViewModel
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    private val viewModel: CreditCardViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppVMTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CreditCardScreen(viewModel)
                }
            }
        }
    }


    @Composable
    fun Greeting(
        name: String,
        modifier: Modifier = Modifier,
        viewModel: GreetingViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
    ) {

        val randomFromVM = viewModel.randomvm
        val random: Int = Random.nextInt(0, 2023)

        Log.d("Random", "From ViewModel: ${randomFromVM.value}")
        Log.d("Random", "From Local composable´s scope: $random")

        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        AppVMTheme {
            Greeting("Android")
        }
    }
}