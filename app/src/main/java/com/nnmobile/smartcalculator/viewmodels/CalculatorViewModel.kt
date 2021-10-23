package com.nnmobile.smartcalculator.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.nnmobile.smartcalculator.Calculator
import kotlin.math.*

class CalculatorViewModel(): ViewModel() {

    private var operationList = ArrayList<Int>() //+ is 0 - is 1 * is 2 / is 3
    private var operandList = ArrayList<Int>()

    //observables
    var eq = mutableStateOf("0")

    fun calculateEQ() {
        eq.value = Calculator.calc(eq.value).toString()
    }

    fun input(item: String) {
        if(eq.value=="0") eq.value = item
        else eq.value = eq.value+item

    }

    fun removeFromEQ() {

    }

    fun clearEQ(){
        eq.value = ""
    }

    fun buttonData(): ArrayList<String> {
        var data = ArrayList<String>()

        data.add("0")
        data.add("1")
        data.add("2")
        data.add("3")
        data.add("4")
        data.add("5")
        data.add("6")
        data.add("7")
        data.add("8")
        data.add("9")
        data.add("(")
        data.add(")")
        data.add("+")
        data.add("-")
        data.add("*")
        data.add("/")
        data.add(".")
        data.add("C")
        data.add("<")
        data.add("=")


        return data
    }

}


