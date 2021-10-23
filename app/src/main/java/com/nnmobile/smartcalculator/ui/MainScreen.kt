package com.nnmobile.smartcalculator.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nnmobile.smartcalculator.viewmodels.CalculatorViewModel

@ExperimentalFoundationApi
@Composable
fun MainScreen(
    calculator: CalculatorViewModel
) {

    val data: List<String> = calculator.buttonData()

    Column(
        modifier= Modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(
            text = calculator.eq.value,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            fontSize = 30.sp,
            textAlign = TextAlign.End,
            color =  Color.White
        )
        Spacer(modifier=Modifier.height(35.dp))

        LazyVerticalGrid(
            cells = GridCells.Fixed(4),
            contentPadding = PaddingValues(8.dp)
        ) {
            itemsIndexed(data) { index,item ->
                Button(
                    modifier = Modifier.padding(4.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = if(index<10) Color.Gray else Color.Blue),
                    onClick = {
                        when(index){
                            19 -> calculator.calculateEQ()
                            18 -> calculator.removeFromEQ()
                            17 -> calculator.clearEQ()
                            else -> calculator.input(item)
                        }
                    }
                ) {
                    Text(
                        text = item,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(24.dp),
                        color = Color.White
                    )
                }
            }
        }


    }
}


