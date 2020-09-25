package io.github.brunogabriel.codesignal

import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.floor

/**
 * Font: Codesignal
 * Consider a city where the streets are perfectly laid out to form an infinite
 * square grid. In this city finding the shortest path between two given points
 * (an origin and a destination) is much easier than in other more complex cities.
 * As a new Uber developer, you are tasked to create an algorithm that does this calculation.
 * Given user's departure and destination coordinates, each of them located on some street,
 * find the length of the shortest route between them assuming that cars can only move along the streets.
 * Each street can be represented as a straight line defined by the x = n or y = n formula, where n is an integer.
 * Example
 * For departure = [0.4, 1] and destination = [0.9, 3], the output should be
 * perfectCity(departure, destination) = 2.7.
 * 0.6 + 2 + 0.1 = 2.7, which is the answer.
 * */

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
