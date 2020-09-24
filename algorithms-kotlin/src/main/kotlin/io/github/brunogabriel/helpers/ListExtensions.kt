package io.github.brunogabriel.helpers

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    if (size > index1 && size > index2) {
        this[index1] = this[index2].also {
            this[index2] = this[index1]
        }
    }
}
