package com.nnmobile.smartcalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.nnmobile.smartcalculator.ui.MainScreen
import com.nnmobile.smartcalculator.viewmodels.CalculatorViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val calculator :CalculatorViewModel = CalculatorViewModel()
        setContent {
            MainScreen(
                calculator = calculator
            )
        }
    }
}
