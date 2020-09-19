package io.github.brunogabriel.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PalindromeTest {
    private val tests = listOf(
        Pair("", true),
        Pair("a", true),
        Pair("aa", true),
        Pair("aba", true),
        Pair("abba", true),
        Pair("abcba", true),
        Pair("did", true),
        Pair("kayak", true),
        Pair("peep", true),
        Pair("repaper", true),
        Pair("deed", true),
        Pair("madam", true),
        Pair("devoved", true),
        Pair("abca", false),
        Pair("ab", false),
        Pair("devolved", false)
    )

    @Test
    fun `testing palindrome`() {
        tests.forEach {
            assertThat(isPalindrome(it.first)).isEqualTo(it.second)
            assertThat(isPalindromeLinear(it.first)).isEqualTo(it.second)
            assertThat(isPalindromeRecursive(it.first)).isEqualTo(it.second)
        }
    }
}
