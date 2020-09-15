package io.github.brunogabriel.sorting

fun <T : Comparable<T>> selectionSort(list: List<T>): List<T> {
    val sortedList = list.toMutableList()

    for (i in 0 until sortedList.size - 1) {

        var minIndex = i

        for (j in i + 1 until sortedList.size) {
            if (sortedList[minIndex] > sortedList[j]) {
                minIndex = j
            }
        }

        sortedList[i] = sortedList[minIndex].also {
            sortedList[minIndex] = sortedList[i]
        }
    }

    return sortedList.toList()
}