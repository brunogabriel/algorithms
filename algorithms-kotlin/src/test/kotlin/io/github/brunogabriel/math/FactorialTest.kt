package io.github.brunogabriel.math

import io.github.brunogabriel.TestCase
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.Test
import java.security.InvalidParameterException

class FactorialTest {
    private val tests = listOf(
        TestCase(0L, 1L),
        TestCase(1L, 1L),
        TestCase(4L, 24L),
        TestCase(5L, 120L),
        TestCase(11L, 39916800L)
    )

    private val invalidInputs = listOf(-1L, -2L, -10L, -20L)

    @Test
    fun `testing all methods`() {
        tests.forEach {
            assertThat(Factorial.linear(it.input)).isEqualTo(it.expected)
            assertThat(Factorial.recursive(it.input)).isEqualTo(it.expected)
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