package io.github.brunogabriel.datastructure

import kotlin.math.max

class BinaryTree<T : Comparable<T>>(
    var root: BinaryNode<T>? = null
) : Tree<T> {
    override fun height(): Int {
        return root?.height() ?: 0
    }

    override fun numberOfNodes(): Int {
        return root?.size() ?: 0
    }

    override fun insert(data: T) {
        if (root == null) {
            root = BinaryNode(data)
        } else {
            root?.insert(data)
        }
    }
}

class BinaryNode<T : Comparable<T>>(
    var data: T,
    var leftNode: BinaryNode<T>? = null,
    var rightNode: BinaryNode<T>? = null,
) {
    fun size(): Int {
        val leftSize = leftNode?.size() ?: 0
        val rightSize = rightNode?.size() ?: 0
        return leftSize + rightSize + 1
    }

    fun insert(data: T) {
        var current = this
        val newNode = BinaryNode(data)

        while (true) {
            if (current.data > data) {
                if (current.leftNode == null) {
                    current.leftNode = newNode
                    break
                } else {
                    current = current.leftNode!!
                }
            } else {
                if (current.rightNode == null) {
                    current.rightNode = newNode
                    break
                } else {
                    current = current.rightNode!!
                }
            }
        }
    }

    fun height(): Int {
        val leftHeight = leftNode?.height() ?: 0
        val rightHeight = rightNode?.height() ?: 0
        return 1 + max(leftHeight, rightHeight)
    }
}