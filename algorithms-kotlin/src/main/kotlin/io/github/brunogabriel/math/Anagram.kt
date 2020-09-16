package io.github.brunogabriel.math

fun isAnagram(word: String, word2: String) = word.toList().sorted() == word2.toList().sorted()

fun isAnagramLiner(word: String, word2: String): Boolean {
    if (word.length != word2.length) {
        return false
    }
    val letters = word2.toMutableList()

    word.forEach { wordChar ->
        val index = letters.indexOfFirst { it == wordChar }
        if (index == -1) {
            return false
        } else {
            letters.removeAt(index)
        }
    }

    return letters.isEmpty()
}

fun isAnagramByCountChars(word: String, word2: String): Boolean {
    return word.toCharArray().groupBy { it } == word2.toCharArray().groupBy { it }
}