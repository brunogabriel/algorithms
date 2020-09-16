package io.github.brunogabriel.datastructure.tree

interface Tree<T : Comparable<T>> {
    fun height(): Int
    fun numberOfNodes(): Int
    fun insert(data: T)
}