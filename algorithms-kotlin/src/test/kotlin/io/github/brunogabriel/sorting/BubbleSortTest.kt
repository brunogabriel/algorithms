package io.github.brunogabriel.sorting

import io.github.brunogabriel.sortingTests
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class BubbleSortTest {
    @Test
    fun `testing bubble sort`() {
        sortingTests().forEach {
            assertThat(bubbleSort(it.first)).isEqualTo(it.second)
        }
    }
}
