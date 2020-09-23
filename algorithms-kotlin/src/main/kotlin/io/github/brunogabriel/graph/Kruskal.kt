package io.github.brunogabriel.graph

fun <T> Graph<T>.kruskal(): Pair<List<Pair<T, T>>, Int> {
    val minTree = mutableListOf<Pair<T, T>>()
    val visited = mutableSetOf<T>()
    val sorted = weights
        .map { Pair(it.key, it.value) }
        .sortedBy { it.second }
        .toMutableList()
    var cost = 0

    while (visited != vertices) {
        val currentEdge = sorted.removeAt(0)

        if (!containsCycle(minTree, currentEdge.first)) {
            val edge = currentEdge.first
            visited.apply {
                add(edge.first)
                add(edge.second)
            }
            minTree.add(edge)
            cost += currentEdge.second
        }
    }
    return Pair(minTree, cost)
}
