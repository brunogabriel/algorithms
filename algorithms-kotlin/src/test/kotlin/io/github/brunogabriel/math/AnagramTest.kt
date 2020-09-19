package io.github.brunogabriel.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class AnagramTest {
    private val tests = listOf(
        Triple("", "", true),
        Triple("final", "fnial", true),
        Triple("proxy", "porxy", true),
        Triple("law", "wal", true),
        Triple("law", "wal", true),
        Triple("listen", "silent", true),
        Triple("laww", "wall", false),
        Triple("aaaaaa", "aaacaa", false),
        Triple(" ", "a", false),
    )

    @Test
    fun `testing anagram`() {
        tests.forEach {
            assertThat(isAnagram(it.first, it.second)).isEqualTo(it.third)
            assertThat(isAnagramLiner(it.first, it.second)).isEqualTo(it.third)
            assertThat(isAnagramByCountChars(it.first, it.second)).isEqualTo(it.third)
        }
    }
}
