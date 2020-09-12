package io.github.brunogabriel.math

import java.security.InvalidParameterException

object Factorial {
    const val invalidNumberMessage = "{number} need to be greater or equals than zero"

    fun linear(number: Long): Long {
        if (number < 0L) {
            throw InvalidParameterException(invalidNumberMessage)
        }

        var result = 1L

        (2L..number).forEach {
            result *= it
        }

        return result
    }

    fun recursive(number: Long): Long {
        return when {
            number < 0L -> {
                throw InvalidParameterException(invalidNumberMessage)
            }
            number <= 1L -> {
                1L
            }
            else -> {
                number * recursive(number - 1)
            }
        }
    }
}