package io.github.brunogabriel.sorting

fun <T : Comparable<T>> quickSort(list: List<T>): List<T> {
    return if (list.size > 1) {
        val pivot = list[list.size / 2]
        val lessElements = list.filter { it < pivot }
        val equalsElements = list.filter { it == pivot }
        val greaterElements = list.filter { it > pivot }
        quickSort(lessElements) + equalsElements + quickSort(greaterElements)
    } else {
        list
    }
}