package io.github.brunogabriel.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LuhnCheckTest {
    private val tests = listOf(
        Pair("49927398716", true),
        Pair("49927398717", false),
        Pair("1234567812345678", false),
        Pair("1234567812345670", true)
    )

    @Test
    fun `testing luhn check`() {
        tests.forEach {
            assertThat(luhnCheck(it.first)).isEqualTo(it.second)
        }
    }
}
