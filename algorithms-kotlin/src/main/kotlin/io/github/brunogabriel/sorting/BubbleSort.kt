package io.github.brunogabriel.sorting

import io.github.brunogabriel.helpers.swap

fun <T : Comparable<T>> bubbleSort(list: List<T>): List<T> {
    val outputList = list.toMutableList()

    for (i in 0 until outputList.size - 1) {
        for (j in 0 until outputList.size - 1 - i) {
            if (outputList[j] > outputList[j + 1]) {
                outputList.swap(j, j + 1)
            }
        }
    }

    return outputList.toList()
}
