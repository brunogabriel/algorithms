package io.github.brunogabriel.math

fun fibonacci(number: Long): Long {
    if (number <= 1) {
        return number
    }

    var result = 1L
    var previous = 1L

    (3..number).forEach { _ ->
        result = (result + previous).also {
            previous = result
        }
    }

    return result
}

fun recursiveFibonacci(number: Long): Long {
    return if (number <= 1) {
        number
    } else {
        fibonacci(number - 1L) + fibonacci(number - 2L)
    }
}