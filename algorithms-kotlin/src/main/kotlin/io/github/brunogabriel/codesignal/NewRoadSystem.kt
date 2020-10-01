package io.github.brunogabriel.codesignal

fun newRoadSystem(roadRegister: MutableList<MutableList<Boolean>>): Boolean {
    return roadRegister.map { element -> element.count { it } } == roadRegister.indices.map {
        index ->
        roadRegister.count { it[index] }
    }
}
