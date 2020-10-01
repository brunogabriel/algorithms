package io.github.brunogabriel.codesignal

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class NewRoadSystemTest {
    private val tests = listOf(
        Pair(
            mutableListOf(
                mutableListOf(false, true, false, false),
                mutableListOf(false, false, true, false),
                mutableListOf(true, false, false, true),
                mutableListOf(false, false, true, false)
            ),
            true
        ),
        Pair(
            mutableListOf(
                mutableListOf(false, false, false, false),
                mutableListOf(false, false, false, false),
                mutableListOf(false, false, false, false),
                mutableListOf(false, false, false, false)
            ),
            true
        )
    )

    @Test
    fun `testing new road system`() {
        tests.forEach {
            assertThat(newRoadSystem(it.first)).isEqualTo(it.second)
        }
    }
}
