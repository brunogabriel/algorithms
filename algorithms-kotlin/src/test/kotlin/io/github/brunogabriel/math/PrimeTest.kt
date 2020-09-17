package io.github.brunogabriel.math

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class PrimeTest {
    private val primeNumbers = listOf(2, 3, 5, 7, 11, 13, 17, 19,
        23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
        89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151,
        157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223,
        227, 229, 233, 239, 241, 251, 257, 263, 269, 271)

    @Test
    fun `testing prime check`() {
        for (i in 0 until 272) {
            val isPrime = i in primeNumbers
            assertThat(primeNumberCheck(i)).isEqualTo(isPrime)
            assertThat(eratosthenesPrimeCheck(i)).isEqualTo(isPrime)
        }
    }
}
