package io.github.brunogabriel.ia.localsearch

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.Before
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class HillClimbingKtTest {

    @MockK
    private lateinit var randomFunction: () -> Double

    @MockK
    private lateinit var maxFunction: (Double) -> Double

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
    }

    @Test
    fun `test hillClimbing`() {
        // given
        every { randomFunction() } returnsMany listOf(1.0, 2.0, 3.0)
        every { maxFunction(1.0) } returns 2.0
        every { maxFunction(2.0) } returns 4.0
        every { maxFunction(3.0) } returns 6.0

        // when
        val result = hillClimbing(2, randomFunction, maxFunction)

        // then
        assertThat(result).isEqualTo(3.0)
    }
}
