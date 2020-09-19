package io.github.brunogabriel.sorting

import io.github.brunogabriel.sortingTests
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SelectionSortKtTest {
    @Test
    fun `testing selection sort`() {
        sortingTests().forEach {
            assertThat(selectionSort(it.first)).isEqualTo(it.second)
        }
    }
}
