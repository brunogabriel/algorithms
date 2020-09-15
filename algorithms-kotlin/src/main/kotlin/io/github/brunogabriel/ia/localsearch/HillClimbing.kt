package io.github.brunogabriel.ia.localsearch

import io.github.brunogabriel.helpers.maxValue

fun <T : Comparable<T>> hillClimbing(
    interactions: Int,
    randomFunction: () -> T,
    maxFunction: (T) -> T
): T {
    return maxValue(randomFunction(),
        List(interactions) { randomFunction() }.maxOf { maxFunction(it) },
        maxFunction
    )
}