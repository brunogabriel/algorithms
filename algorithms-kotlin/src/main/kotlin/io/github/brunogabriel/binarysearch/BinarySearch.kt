package io.github.brunogabriel.binarysearch

import io.github.brunogabriel.exception.NotFoundException

object BinarySearch {
    const val invalidValueMessage = "{value} is not found"

    fun linear(
        array: Array<Int>,
        value: Int
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

        throw NotFoundException(invalidValueMessage)
    }

    fun recursive(
        array: Array<Int>,
        value: Int,
        start: Int = 0,
        end: Int = array.size - 1
    ): Int {
        if (start <= end) {
            val mid = start + (end - start) / 2
            return when {
                array[mid] == value -> mid
                array[mid] > value -> recursive(array, value, start, mid - 1)
                else -> recursive(array, value, mid + 1, end)
            }
        }

        throw NotFoundException(invalidValueMessage)
    }
}