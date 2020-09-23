package io.github.brunogabriel.graph

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class GraphUtilTest {
    private val tests = listOf(
        Triple(
            listOf(Pair("A", "B"), Pair("A", "C")),
            Pair("C", "B"), true
        ),

        Triple(
            listOf(Pair("A", "B"), Pair("C", "A")),
            Pair("C", "B"), true
        ),

        Triple(
            listOf(Pair("A", "B")),
            Pair("C", "B"), false
        )
    )

    @Test
    fun `testing containsCycle`() {
        tests.forEach {
            assertThat(containsCycle(it.first, it.second)).isEqualTo(it.third)
        }
    }
}
