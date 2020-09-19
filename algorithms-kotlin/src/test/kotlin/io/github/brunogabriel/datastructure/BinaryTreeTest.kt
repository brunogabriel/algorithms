package io.github.brunogabriel.datastructure

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class BinaryTreeTest {
    private val sampleNodes = listOf(10, 4, 14, 3, 5, 2, 7, 6, 12, 11, 13, 15, 17, 18)

    @Test
    fun `testing numberOfNodes`() {
        assertThat(BinaryTree<Int>().numberOfNodes()).isEqualTo(0)

        assertThat(
            BinaryTree<Int>().apply {
                insert(10)
            }.numberOfNodes()
        ).isEqualTo(1)

        assertThat(
            BinaryTree<Int>().apply {
                insert(10)
                insert(8)
            }.numberOfNodes()
        ).isEqualTo(2)

        assertThat(
            BinaryTree<Int>().apply {
                insert(10)
                insert(11)
            }.numberOfNodes()
        ).isEqualTo(2)

        assertThat(
            BinaryTree<Int>().apply {
                sampleNodes.forEach { insert(it) }
            }.numberOfNodes()
        ).isEqualTo(14)
    }

    @Test
    fun `testing height`() {
        assertThat(BinaryTree<Int>().height()).isEqualTo(0)

        assertThat(
            BinaryTree<Int>().apply {
                insert(10)
            }.height()
        ).isEqualTo(1)

        assertThat(
            BinaryTree<Int>().apply {
                insert(10)
                insert(8)
            }.height()
        ).isEqualTo(2)

        assertThat(
            BinaryTree<Int>().apply {
                insert(10)
                insert(11)
            }.height()
        ).isEqualTo(2)

        assertThat(
            BinaryTree<Int>().apply {
                sampleNodes.forEach { insert(it) }
            }.height()
        ).isEqualTo(5)
    }
}
