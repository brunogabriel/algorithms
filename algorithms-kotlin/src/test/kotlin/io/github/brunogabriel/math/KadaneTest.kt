package io.github.brunogabriel.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class KadaneTest {
    private val tests = listOf(
        Pair(listOf(-2L, 1L, -3L, 4L, -1L, 2L, 1L, -5L, 4L), 6L),
        Pair(listOf(-2L, -3L, 4L, -1L, -2L, 1L, 5L, -3), 7L),
        Pair(listOf(-1L, 12L, -3L, 1000L, -1L, 10L), 1018L),
        Pair(listOf(1L, 1L, 1L, 1L, 1L, -6L, 1000L, -1L, 1L), 1000L),
    )

    @Test
    fun `testing kadane`() {
        tests.forEach {
            assertThat(kadaneSum(it.first)).isEqualTo(it.second)
        }
    }
}