package io.github.brunogabriel.math

fun factorial(number: Long): Long {
    if (number < 0L) {
        return Long.MIN_VALUE
    }

    var result = 1L

    (2L..number).forEach {
        result *= it
    }

    return result
}

fun factorialRecursive(number: Long): Long {
    return when {
        number < 0L -> return Long.MIN_VALUE
        number <= 1L -> 1L
        else -> number * factorialRecursive(number - 1)
    }
}