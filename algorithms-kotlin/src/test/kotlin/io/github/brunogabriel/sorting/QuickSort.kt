package io.github.brunogabriel.sorting

object QuickSort {
    fun sortMiddlePivot(list: List<Int>): List<Int> {
        return if (list.size > 1) {
            val pivot = list[list.size / 2]
            val lessElements = list.filter { it < pivot }
            val equalsElements = list.filter { it == pivot }
            val greaterElements = list.filter { it > pivot }
            sortMiddlePivot(lessElements) + equalsElements + sortMiddlePivot(greaterElements)
        } else {
            list
        }
    }
}