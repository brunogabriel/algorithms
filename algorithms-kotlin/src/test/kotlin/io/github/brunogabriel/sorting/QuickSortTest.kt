package io.github.brunogabriel.sorting

import org.assertj.core.api.Assertions.assertThat
import io.github.brunogabriel.sortingTests
import org.junit.Test

class QuickSortTest {
    @Test
    fun `testing quickSort`() {
        sortingTests().forEach {
            assertThat(QuickSort.sortMiddlePivot(it.first)).isEqualTo(it.second)
        }
    }
}