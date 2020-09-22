package io.github.brunogabriel.math

fun Long.powerRecursive(b: Long): Long {
    return when (b) {
        0L -> 1L
        1L -> this
        else -> {
            val power = powerRecursive(b / 2) * powerRecursive(b / 2)
            if (b % 2L == 0L) {
                power
            } else {
                this * power
            }
        }
    }
}
