package ru.netology

fun main() {
    val amount = 111500
    val amountCommission = amount / 100 * 0.75
    val commission = if (amountCommission >= 35) amountCommission else 35
    println(commission)
}