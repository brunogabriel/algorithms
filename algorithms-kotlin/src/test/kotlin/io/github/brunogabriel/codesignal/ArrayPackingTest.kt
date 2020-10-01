package io.github.brunogabriel.codesignal

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ArrayPackingTest {
    private val tests = listOf(
        Pair(mutableListOf(24, 85, 0), 21784),
        Pair(mutableListOf(23, 45, 39), 2567447),
        Pair(mutableListOf(1, 2, 4, 8), 134480385),
        Pair(mutableListOf(5), 5),
        Pair(mutableListOf(187, 99, 42, 43), 724198331)
    )
    @Test
    fun `testing array packing`() {
        tests.forEach {
            assertThat(arrayPacking(it.first)).isEqualTo(it.second)
        }
    }
}
