package io.github.brunogabriel.math

fun Long.powerRecursive(b: Long): Long {
    return when {
        b == 0L -> 1L
        b == 1L -> this
        b % 2 == 0L -> powerRecursive(b / 2) * powerRecursive(b / 2)
        else -> this * powerRecursive((b - 1) / 2) * powerRecursive((b - 1) / 2)
    }
}
