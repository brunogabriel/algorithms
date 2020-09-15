package io.github.brunogabriel.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FactorialTest {
    private val tests = listOf(
        Pair(0L, 1L),
        Pair(1L, 1L),
        Pair(4L, 24L),
        Pair(5L, 120L),
        Pair(11L, 39916800L)
    )

    private val invalidInputs = listOf(-1L, -2L, -10L, -20L)

    @Test
    fun `testing all methods`() {
        tests.forEach {
            assertThat(factorial(it.first)).isEqualTo(it.second)
            assertThat(factorialRecursive(it.first)).isEqualTo(it.second)
        }
    }

    @Test
    fun `testing invalid inputs`() {
        invalidInputs.forEach {
            assertThat(factorial(it)).isEqualTo(Long.MIN_VALUE)
            assertThat(factorialRecursive(it)).isEqualTo(Long.MIN_VALUE)
        }
    }
}