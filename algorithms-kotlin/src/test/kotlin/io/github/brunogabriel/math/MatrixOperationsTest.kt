package io.github.brunogabriel.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MatrixOperationsTest {
    private lateinit var matrixA: List<List<Long>>
    private lateinit var matrixB: List<List<Long>>

    @Test
    fun `testing matrix multiplication 1`() {
        // given
        matrixA = listOf(listOf(1L, 2L), listOf(3L, 4L))
        matrixB = listOf(listOf(5L, 6L), listOf(7L, 8L))

        // then
        assertThat(matrixA * matrixB)
            .isEqualTo(listOf(listOf(19L, 22L), listOf(43L, 50L)))
    }

    @Test
    fun `testing matrix multiplication 2`() {
        // given
        matrixA = listOf(listOf(1L, 2L, 3L))
        matrixB = listOf(listOf(1L), listOf(2L), listOf(3L))

        // then
        assertThat(matrixA * matrixB)
            .isEqualTo(listOf(listOf(14L)))
    }

    @Test
    fun `testing matrix summation 1`() {
        // given
        matrixA = listOf(listOf(1L, 1L), listOf(1L, 1L))
        matrixB = listOf(listOf(1L, 1L), listOf(1L, 1L))

        // then
        assertThat(matrixA + matrixB)
            .isEqualTo(listOf(listOf(2L, 2L), listOf(2L, 2L)))
    }

    @Test
    fun `testing matrix summation 2`() {
        // given
        matrixA = listOf(listOf(1L, 1L, 1L))
        matrixB = listOf(listOf(1L, 1L, 1L))

        // then
        assertThat(matrixA + matrixB)
            .isEqualTo(listOf(listOf(2L, 2L, 2L)))
    }

    @Test
    fun `testing invalid multiplication`() {
        // given
        matrixA = listOf(listOf(1L, 2L, 3L))
        matrixB = listOf(listOf(1L, 2L), listOf(1L, 2L))

        // then
        assertThat(matrixA * matrixB).isEqualTo(emptyList<List<Long>>())
    }

    @Test
    fun `testing invalid summation`() {
        // given
        matrixA = listOf(listOf(1L, 2L), listOf(1L, 2L))
        matrixB = listOf(listOf(1L, 2L))

        // then
        assertThat(matrixA + matrixB).isEqualTo(emptyList<List<Long>>())
    }
}
