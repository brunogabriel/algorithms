package io.github.brunogabriel.math

fun isPalindrome(word: String) = word == word.reversed()

fun isPalindromeLinear(word: String): Boolean {
    for ((i, j) in word.indices.zip(word.indices.reversed())) {
        if (i >= j) {
            return true
        }

        if (word[i] != word[j]) {
            return false
        }
    }

    return true
}

fun isPalindromeRecursive(word: String, startIndex: Int = 0, endIndex: Int = word.length - 1): Boolean {
    return when {
        startIndex >= endIndex -> true
        word[startIndex] != word[endIndex] -> false
        else -> isPalindromeRecursive(word, startIndex + 1, endIndex - 1)
    }
}
