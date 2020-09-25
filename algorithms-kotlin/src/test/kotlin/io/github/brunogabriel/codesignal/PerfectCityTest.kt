package io.github.brunogabriel.codesignal

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PerfectCityTest {
    private val tests = listOf(
        Triple(listOf(0.4, 1.0), listOf(0.9, 3.0), 2.7),
        Triple(listOf(2.4, 1.0), listOf(5.0, 7.3), 8.9),
        Triple(listOf(0.9, 6.0), listOf(1.1, 5.0), 1.2000000000000002),
        Triple(listOf(.0, 0.4), listOf(1.0, 0.6), 2.0)
    )

    @Test
    fun `testing perfect city`() {
        tests.forEach {
            assertThat(perfectCity(it.first.toMutableList(), it.second.toMutableList())).isEqualTo(it.third)
        }
    }
}
