package io.github.brunogabriel.graph

fun <T> isCycle(treeEdges: List<Pair<T, T>>, edge: Pair<T, T>): Boolean {
    var visited = Pair(first = false, second = false)

    treeEdges.forEach { treeEdge ->
        val list = treeEdge.toList()
        val firstVisited = list.contains(edge.first)
        val secondVisited = list.contains(edge.first)
        visited = visited.copy(first = visited.first || firstVisited, second = visited.second || secondVisited)
    }

    return visited.first && visited.second
}
