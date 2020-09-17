package io.github.brunogabriel.search.binarysearch

fun <T : Comparable<T>> binarySearch(
        array: Array<T>,
        value: T
): Int {
    var start = 0
    var end = array.size - 1
    while (start <= end) {
        val mid = start + (end - start) / 2
        when {
            array[mid] == value -> return mid
            array[mid] > value -> end = mid - 1
            else -> start = mid + 1
        }
    }

    return Int.MIN_VALUE
}

fun <T : Comparable<T>> recursiveBinarySearch(
        array: Array<T>,
        value: T,
        start: Int = 0,
        end: Int = array.size - 1
): Int {
    if (start <= end) {
        val mid = start + (end - start) / 2
        return when {
            array[mid] == value -> mid
            array[mid] > value -> recursiveBinarySearch(array, value, start, mid - 1)
            else -> recursiveBinarySearch(array, value, mid + 1, end)
        }
    }

    return Int.MIN_VALUE
}