package io.github.brunogabriel.math

fun luhnCheck(number: String): Boolean {
    var s1 = 0
    var s2 = 0

    number.reversed().forEachIndexed { index, char ->
        val digit = Character.digit(char, 10)
        if (index % 2 == 0) {
            s1 += digit
        } else {
            s2 += 2 * digit
            if (digit > 4) {
                s2 -= 9
            }
        }
    }

    return (s1 + s2) % 10 == 0
}
