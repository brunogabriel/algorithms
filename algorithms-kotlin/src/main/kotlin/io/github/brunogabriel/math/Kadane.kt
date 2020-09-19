package io.github.brunogabriel.math

import kotlin.math.max

fun kadaneSum(list: List<Long>): Long {
    var result = 0L
    var currentSum = 0L

    list.forEach {
        currentSum = max(it, it + currentSum)
        if (currentSum > result) {
            result = currentSum
        }
    }

    return result
}