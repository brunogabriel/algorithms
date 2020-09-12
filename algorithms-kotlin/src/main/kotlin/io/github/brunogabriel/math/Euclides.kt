package io.github.brunogabriel.math

object Euclides {
    fun calculateLinearGCD(x: Long, y: Long): Long {
        var numberX = x
        var numberY = y

        if (numberX < numberY) {
            numberX = numberY.also { numberY = numberX }
        }

        while (numberY != 0L) {
            numberX = numberY.also {
                numberY = numberX % numberY
            }
        }

        return numberX
    }

    fun calculateRecursiveGCD(x: Long, y: Long): Long {
        return when {
            y == 0L -> x
            x < y -> calculateRecursiveGCD(y, x)
            else -> calculateRecursiveGCD(y, x % y)
        }
    }
}