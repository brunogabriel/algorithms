package io.github.brunogabriel.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PowerTest {
    private val tests = listOf(
        Triple(1000L, 0L, 1L),
        Triple(2L, 2L, 4L),
        Triple(3L, 3L, 27L),
        Triple(2L, 5L, 32L)
    )

    @Test
    fun `testing power`() {
        tests.forEach { assertThat(it.first.powerRecursive(it.second)).isEqualTo(it.third) }
    }
}
