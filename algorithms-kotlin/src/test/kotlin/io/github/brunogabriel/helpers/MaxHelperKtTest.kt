package io.github.brunogabriel.helpers

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MaxHelperKtTest {
    @Test
    fun `testing maxValue`() {
        assertThat(maxValue(10.0, 9.999, { it })).isEqualTo(10.0)
        assertThat(maxValue(9.999, 10.0, { it })).isEqualTo(10.0)
        assertThat(maxValue(9.998, 9.9999, { it })).isEqualTo(9.9999)
        assertThat(maxValue(1, 1, { it })).isEqualTo(1)
    }
}