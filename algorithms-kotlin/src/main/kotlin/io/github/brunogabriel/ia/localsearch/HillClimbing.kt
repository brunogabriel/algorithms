package io.github.brunogabriel.ia.localsearch

import io.github.brunogabriel.helpers.max

fun <T : Comparable<T>> hillClimbing(
    interactions: Int,
    randomFunction: () -> T,
    maxFunction: (T) -> T
): T {
    randomFunction().let { randomValue ->
        return max(
            randomValue,
            List(interactions) { randomFunction() }.maxByOrNull { maxFunction(it) }
                ?: randomValue,
            maxFunction
        )
    }
}
