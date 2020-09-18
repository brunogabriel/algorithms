package io.github.brunogabriel.search

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class BinarySearchTest {
    private val array = arrayOf(0, 1, 2, 10, 100, 123, 124, 199, 1999, 99999)
    private val invalidInputs = listOf(-10, -20, 999991)

    @Test
    fun `testing all methods`() {
        array.forEachIndexed { index, i ->
            assertThat(binarySearch(array, i)).isEqualTo(index)
            assertThat(recursiveBinarySearch(array, i)).isEqualTo(index)
        }
    }

    @Test
    fun `testing invalid inputs`() {
        invalidInputs.forEach {
            assertThat(binarySearch(array, it)).isEqualTo(Int.MIN_VALUE)
            assertThat(recursiveBinarySearch(array, it)).isEqualTo(Int.MIN_VALUE)
        }
    }
}