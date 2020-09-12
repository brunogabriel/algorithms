package io.github.brunogabriel.math

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.Test
import java.security.InvalidParameterException

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
            assertThat(Factorial.linear(it.first)).isEqualTo(it.second)
            assertThat(Factorial.recursive(it.first)).isEqualTo(it.second)
        }
    }

    @Test
    fun `testing invalid inputs`() {
        invalidInputs.forEach { input ->
            assertThatThrownBy { Factorial.linear(input) }
                .isInstanceOf(InvalidParameterException::class.java)
                .hasMessage(Factorial.invalidNumberMessage)

            assertThatThrownBy { Factorial.recursive(input) }
                .isInstanceOf(InvalidParameterException::class.java)
                .hasMessage(Factorial.invalidNumberMessage)
        }
    }
}