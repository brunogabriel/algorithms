package io.github.brunogabriel.graph

fun dijkstra(graph: Graph<String>, start: String): Map<String, Pair<String?, Int>> {
    val visitedVertices = mutableSetOf<String>()

    val previousVertices: MutableMap<String, String?> = graph.vertices
        .map { it to null }
        .toMap()
        .toMutableMap()

    val distanceTo: MutableMap<String, Int> = graph.vertices
        .map { it to Int.MAX_VALUE }
        .toMap()
        .toMutableMap()

    distanceTo[start] = 0

    while (visitedVertices != graph.vertices) {
        val vertex = distanceTo
            .filter { !visitedVertices.contains(it.key) }
            .minByOrNull { it.value }!!.key

        graph.edges[vertex]?.minus(visitedVertices)?.forEach {
            val distance = distanceTo[vertex]!! + graph.weights.getValue(Pair(vertex, it))
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
