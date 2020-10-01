package io.github.brunogabriel.codesignal

import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.floor

fun perfectCity(departure: MutableList<Double>, destination: MutableList<Double>): Double {
    var xAxis = abs(departure[0] - destination[0])
    var yAxis = abs(departure[1] - destination[1])

    if (floor(departure[0]) != departure[0] && floor(destination[0]) != destination[0] &&
        floor(departure[0]) == floor(destination[0]) && departure[1] != destination[1]
    ) {
        xAxis = abs(departure[0] - floor(departure[0]) + destination[0] - floor(destination[0])).coerceAtMost(
            abs(
                departure[0] - ceil(departure[0]) + destination[0] - ceil(destination[0])
            )
        )
    } else if (floor(departure[1]) != departure[1] && floor(destination[1]) != destination[1] &&
        floor(departure[1]) == floor(destination[1]) && departure[0] != destination[0]
    ) {
        yAxis = abs(departure[1] - floor(departure[1]) + destination[1] - floor(destination[1]))
            .coerceAtMost(abs(departure[1] - ceil(departure[1]) + destination[1] - ceil(destination[1])))
    }

    return xAxis + yAxis
}
