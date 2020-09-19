package io.github.brunogabriel.graph

fun <T> Graph<T>.dijkstra(start: T): Map<T, Pair<T?, Int>> {
    val visitedVertices = mutableSetOf<T>()

    val previousVertices: MutableMap<T, T?> = vertices
        .map { it to null }
        .toMap()
        .toMutableMap()

    val distanceTo: MutableMap<T, Int> = vertices
        .map { it to Int.MAX_VALUE }
        .toMap()
        .toMutableMap()

    distanceTo[start] = 0

    while (visitedVertices != vertices) {
        val vertex = distanceTo
            .filter { !visitedVertices.contains(it.key) }
            .minByOrNull { it.value }!!.key

        edges[vertex]?.minus(visitedVertices)?.forEach {
            val distance = distanceTo[vertex]!! + weights.getValue(Pair(vertex, it))
            if (distance < distanceTo[it]!!) {
                distanceTo[it] = distance
                previousVertices[it] = vertex
            }
        }

        visitedVertices.add(vertex)
    }

    return distanceTo
        .map { it.key to Pair(previousVertices[it.key], it.value) }
        .toMap()
}
