package com.ruslooob._800.learning_from_mathematics_472A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isPrimeNumber1() {
        assertTrue(Main.isPrimeNumber(3));
    }

    @Test
    void isPrimeNumber2() {
        assertTrue(Main.isPrimeNumber(5));
    }

    @Test
    void isPrimeNumber3() {
        assertFalse(Main.isPrimeNumber(4));
    }

    @Test
    void isPrimeNumber() {
        assertTrue(Main.isPrimeNumber(2));
    }
}