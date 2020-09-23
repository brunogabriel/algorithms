package io.github.brunogabriel.graph

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class KruskalTest {
    private lateinit var graph: Graph<String>

    @Test
    fun `testing krukal case 1`() {
        // given
        val vertices = setOf("A", "B", "C", "D")
        val edges = mapOf(
            "A" to setOf("B", "C"),
            "B" to setOf("A", "C", "D"),
            "C" to setOf("A", "B", "D"),
            "D" to setOf("C", "D")
        )
        val weights = mapOf(
            Pair("A", "B") to 1,
            Pair("A", "C") to 2,

            Pair("B", "A") to 1,
            Pair("B", "C") to 0,
            Pair("B", "D") to 3,

            Pair("C", "A") to 2,
            Pair("C", "B") to 0,
            Pair("C", "D") to 1,

            Pair("D", "B") to 3,
            Pair("D", "C") to 1,
        )
        graph = Graph(vertices, edges, weights)

        // when
        val result = graph.kruskal()

        // then
        assertThat(result.second).isEqualTo(2)
        assertThat(result.first)
            .containsAnyOf(Pair("A", "B"), Pair("B", "A"))
            .containsAnyOf(Pair("B", "C"), Pair("C", "B"))
            .containsAnyOf(Pair("C", "D"), Pair("D", "C"))
    }
}
