package io.github.brunogabriel.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FibonacciTest {

    private val tests = listOf(
        Pair(0L, 0L),
        Pair(1L, 1L),
        Pair(2L, 1L),
        Pair(3L, 2L),
        Pair(4L, 3L),
        Pair(5L, 5L),
        Pair(6L, 8L),
        Pair(7L, 13L),
        Pair(8L, 21L),
        Pair(9L, 34L),
        Pair(10L, 55L),
        Pair(11L, 89L),
        Pair(12L, 144L)
    )

    @Test
    fun `testing fibonacci`() {
        tests.forEach {
            assertThat(fibonacci(it.first)).isEqualTo(it.second)
            assertThat(recursiveFibonacci(it.first)).isEqualTo(it.second)
        }
    }
}