package io.github.brunogabriel.graph

fun <T> Graph<T>.bfs(start: T): List<T> {
    val visited = mutableListOf<T>()
    val queue = mutableListOf<T>().apply {
        add(start)
    }
    while (queue.isNotEmpty()) {
        val node = queue.removeAt(0)
        if (!visited.contains(node)) {
            visited.add(node)
            edges[node]?.forEach {
                queue.add(it)
            }
        }
    }

    return visited
}
