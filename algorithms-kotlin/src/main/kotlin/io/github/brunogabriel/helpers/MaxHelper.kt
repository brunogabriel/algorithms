package io.github.brunogabriel.helpers

inline fun <T : Comparable<T>> maxValue(a: T, b: T, maxFunction: (T) -> T): T {
    return if (maxFunction(a) > maxFunction(b)) {
        a
    } else {
        b
    }
}