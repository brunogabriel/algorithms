package io.github.brunogabriel.math

import kotlin.math.sqrt

fun primeNumberCheck(number: Int): Boolean {
    if (number < 2) {
        return false
    }
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

fun eratosthenesPrimeCheck(number: Int): Boolean {
    if (number < 2) {
        return false
    }
    for (i in 2..sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

