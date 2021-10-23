package com.nnmobile.smartcalculator.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CalculatorViewModel(): ViewModel() {

    private var operationList = ArrayList<Int>() //+ is 0 - is 1 * is 2 / is 3
    private var operatorList = ArrayList<Int>()

    //observables
    var eq = mutableStateOf("0")

    fun calculate() {

    }

    fun addToEQ() {

    }

    fun removeFromEquation() {

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
        data.add("+")
        data.add("-")
        data.add("*")
        data.add("/")
        data.add("<")
        data.add("=")

        return data
    }

}