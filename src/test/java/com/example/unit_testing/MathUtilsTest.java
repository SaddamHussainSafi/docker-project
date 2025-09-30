package com.example.unit_testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilsTest {

    @Test
    @DisplayName("multiply: handles positive numbers")
    void multiply_withPositives() {
        assertEquals(12, MathUtils.multiply(3, 4));
        assertEquals(1, MathUtils.multiply(1, 1));
    }

    @Test
    @DisplayName("multiply: handles negatives and mixed signs")
    void multiply_withNegatives() {
        assertEquals(6, MathUtils.multiply(-2, -3));
        assertEquals(-6, MathUtils.multiply(-2, 3));
        assertEquals(-6, MathUtils.multiply(2, -3));
    }

    @Test
    @DisplayName("multiply: handles zero")
    void multiply_withZero() {
        assertEquals(0, MathUtils.multiply(0, 5));
        assertEquals(0, MathUtils.multiply(7, 0));
        assertEquals(0, MathUtils.multiply(0, 0));
    }
}
