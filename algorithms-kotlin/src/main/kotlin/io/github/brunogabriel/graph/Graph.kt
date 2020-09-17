package io.github.brunogabriel.graph

data class Graph<T : Comparable<T>>(
    val vertices: Set<T>,
    val edges: Map<T, Set<T>>,
    val weights: Map<Pair<T, T>, Int>
)