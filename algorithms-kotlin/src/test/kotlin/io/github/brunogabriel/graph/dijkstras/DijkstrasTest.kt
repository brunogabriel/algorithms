package io.github.brunogabriel.graph.dijkstras

import io.github.brunogabriel.graph.Graph
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class DijkstrasTest {

    private lateinit var graph: Graph<String>

    @Test
    fun `testing dijkstras`() {
        // given
        val vertices = setOf("A", "B", "C", "D", "E")
        val edges = mapOf(
                "A" to setOf("B", "C"),
                "B" to setOf("C", "D", "E"),
                "C" to setOf("B", "D", "E"),
                "D" to emptySet(),
                "E" to setOf("D"),
        )
        val weights = mapOf(
                Pair("A", "B") to 4,
                Pair("A", "C") to 2,

                Pair("B", "C") to 3,
                Pair("B", "D") to 2,
                Pair("B", "E") to 3,

                Pair("C", "B") to 1,
                Pair("C", "D") to 4,
                Pair("C", "E") to 5,

                Pair("E", "D") to 1
        )

        graph = Graph(vertices, edges, weights)

        // when
        assertThat(dijkstra(graph, "A")).isEqualTo(
            mapOf("A" to Pair(null, 0),
                "B" to Pair("C", 3),
                "C" to Pair("A", 2),
                "D" to Pair("B", 5),
                "E" to Pair("B", 6)
        ))
    }
}