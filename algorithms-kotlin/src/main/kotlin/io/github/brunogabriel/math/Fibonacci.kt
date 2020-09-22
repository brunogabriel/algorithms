package io.github.brunogabriel.math

private val fibonacciMatrix = listOf(listOf(1L, 1L), listOf(1L, 0L))

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

fun fibonacciLogN(number: Long): Long {
    return if (number <= 1) {
        number
    } else {
        calculateMatrixPower(fibonacciMatrix, number)[0][1]
    }
}

private fun calculateMatrixPower(matrix: List<List<Long>>, number: Long): List<List<Long>> {
    return if (number == 1L) {
        fibonacciMatrix
    } else {
        val power = calculateMatrixPower(matrix, number / 2L) * calculateMatrixPower(matrix, number / 2L)
        if (number % 2L == 0L) {
            power
        } else {
            matrix * power
        }
    }
}
