package io.github.brunogabriel.math

fun matrixMultiplication(
    matrixA: List<List<Long>>,
    matrixB: List<List<Long>>
): List<List<Long>> {

    if (matrixA.first().size != matrixB.size) {
        return emptyList()
    }

    val result = Array(matrixA.size) { Array(matrixB.first().size) { 0L } }

    for (i in matrixA.indices) {
        for (j in matrixB[i].indices) {
            for (k in matrixA[i].indices) {
                result[i][j] += matrixA[i][k] * matrixB[k][j]
            }
        }
    }

    return result.map { it.toList() }
}

fun matrixSummation(
    matrixA: List<List<Long>>,
    matrixB: List<List<Long>>
): List<List<Long>> {

    if (matrixA.size != matrixB.size || matrixA.indices != matrixB.indices) {
        return emptyList()
    }

    matrixA.indices.forEach {
        if (matrixA[it].size != matrixB[it].size) {
            return emptyList()
        }
    }

    val result = Array(matrixA.size) { Array(matrixA.first().size) { 0L } }

    for (i in matrixA.indices) {
        for (j in matrixA[i].indices) {
            result[i][j] = matrixA[i][j] + matrixB[i][j]
        }
    }

    return result.map { it.toList() }
}

operator fun List<List<Long>>.times(other: List<List<Long>>): List<List<Long>> =
    matrixMultiplication(this, other)

operator fun List<List<Long>>.plus(other: List<List<Long>>): List<List<Long>> =
    matrixSummation(this, other)
