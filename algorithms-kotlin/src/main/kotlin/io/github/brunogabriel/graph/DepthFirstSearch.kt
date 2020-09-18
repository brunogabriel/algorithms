package io.github.brunogabriel.graph

import java.util.*

fun <T> Graph<T>.dfs(start: T): MutableList<T> {
    val visited = mutableListOf<T>()
    val stack = LinkedList<T>().apply {
        push(start)
    }
    while (stack.isNotEmpty()) {
        val node = stack.pop()
        if (!visited.contains(node)) {
            visited.add(node)
            edges[node]?.forEach {
                stack.push(it)
            }
        }
    }
    return visited
}