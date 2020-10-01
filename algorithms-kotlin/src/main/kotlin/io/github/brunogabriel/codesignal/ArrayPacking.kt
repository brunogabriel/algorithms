package io.github.brunogabriel.codesignal

fun arrayPacking(a: MutableList<Int>): Int {
    return a.reversed().joinToString("") { Integer.toBinaryString(it).padStart(8, '0') }.toInt(2)
}
