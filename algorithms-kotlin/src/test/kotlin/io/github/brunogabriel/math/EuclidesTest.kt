package io.github.brunogabriel.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class EuclidesTest {
    private val tests = listOf(
        Triple(1000L, 0L, 1000L),
        Triple(0L, 0L, 0L),
        Triple(150L, 304L, 2L),
        Triple(1000L, 10L, 10L),
        Triple(150L, 9L, 3L)
    )

    @Test
    fun `testing calculating GCD`() {
        tests.forEach {
            assertThat(calculateGCD(it.first, it.second)).isEqualTo(it.third)
            assertThat(calculateRecursiveGCD(it.first, it.second)).isEqualTo(it.third)
        }
    }
}