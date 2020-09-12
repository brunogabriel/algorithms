package io.github.brunogabriel.binarysearch

import io.github.brunogabriel.exception.NotFoundException
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.Test

class BinarySearchTest {
    private val array = arrayOf(0, 1, 2, 10, 100, 123, 124, 199, 1999, 99999)
    private val invalidInputs = listOf(-10, -20, 999991)

    @Test
    fun `testing all methods`() {
        array.forEachIndexed { index, i ->
            assertThat(BinarySearch.linear(array, i)).isEqualTo(index)
            assertThat(BinarySearch.recursive(array, i)).isEqualTo(index)
        }
    }

    @Test
    fun `testing invalid inputs`() {
        invalidInputs.forEach { input ->
            assertThatThrownBy { BinarySearch.linear(array, input) }
                .isInstanceOf(NotFoundException::class.java)
                .hasMessage(BinarySearch.invalidValueMessage)

            assertThatThrownBy { BinarySearch.recursive(array, input) }
                .isInstanceOf(NotFoundException::class.java)
                .hasMessage(BinarySearch.invalidValueMessage)
        }
    }
}