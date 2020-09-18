package io.github.brunogabriel.graph.bfs

import io.github.brunogabriel.graph.Graph
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class BreadthFirstSearchTest {
    private lateinit var graph: Graph<String>

    @Test
    fun `testing bfs case 1`() {
        // given
        val vertices = setOf("0", "1", "2", "3")
        val edges = mapOf(
            "0" to setOf("1", "2"),
            "1" to setOf("2"),
            "2" to setOf("0", "3"),
            "3" to setOf("3")
        )
        graph = Graph(vertices, edges, emptyMap())

        assertThat(bfs(graph, "2"))
            .isEqualTo(listOf("2", "0", "3", "1"))
    }

    @Test
    fun `testing bfs case 2`() {
        // given
        val vertices = setOf("1", "2", "3", "4", "5", "6", "7", "8", "9")
        val edges = mapOf(
            "1" to setOf("2", "3", "4"),
            "2" to setOf("1", "5", "6"),
            "3" to setOf("1", "7"),
            "4" to setOf("1", "8"),
            "5" to setOf("2"),
            "6" to setOf("2"),
            "7" to setOf("3"),
            "8" to setOf("4", "9"),
            "9" to setOf("8")
        )
        graph = Graph(vertices, edges, emptyMap())

        assertThat(bfs(graph, "1"))
            .isEqualTo(listOf("1", "2", "3", "4", "5", "6", "7", "8", "9"))
    }
}