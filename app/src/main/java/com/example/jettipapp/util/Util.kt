package com.example.jettipapp.util

fun calculateTotal(totalBill: Double, tipPercentage: Int): Double {
    return if(totalBill > 1 && totalBill.toString().isNotEmpty())
        (totalBill * tipPercentage) / 100 else 0.0
}

fun calculateTotalPerPerson(totalBill: Double, splitBy: Int, tipPercentage: Int) : Double {
    val bill = calculateTotal(totalBill=totalBill, tipPercentage=tipPercentage) + totalBill
    return (bill / splitBy)
}