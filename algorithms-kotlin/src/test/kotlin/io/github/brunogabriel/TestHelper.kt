package io.github.brunogabriel

fun sortingTests() = listOf(
    Pair(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9), listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)),
    Pair(listOf(9, 8, 7, 6, 5, 4, 3, 2, 0), listOf(0, 2, 3, 4, 5, 6, 7, 8, 9)),
    Pair(listOf(1, 10, 1, 10, 10, 100, -999, 1), listOf(-999, 1, 1, 1, 10, 10, 10, 100)),
    Pair(listOf(-1, 100, -55, 100, 1999, 999, -999, 127), listOf(-999, -55, -1, 100, 100, 127, 999, 1999))
)