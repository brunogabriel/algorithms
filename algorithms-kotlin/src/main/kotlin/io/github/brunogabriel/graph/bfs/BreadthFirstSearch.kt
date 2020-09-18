package io.github.brunogabriel.graph.bfs

import io.github.brunogabriel.graph.Graph

fun bfs(graph: Graph<String>, start: String): List<String> {
    val visited = mutableListOf<String>()
    val queue = mutableListOf<String>()

    queue.add(start)
    visited.add(start)

    while (queue.isNotEmpty()) {
        val node = queue.removeAt(0)
        graph.edges[node]?.forEach {
            if (!visited.contains(it)) {
                visited.add(it)
                queue.add(it)
            }
        }
    }

    return visited
}