package com.ruslooob.odd_and_even_318A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void oddOrEvenSolver1() {
        assertEquals(5, Main.oddOrEvenSolver(10, 3));
    }

    @Test
    void oddOrEvenSolver2() {
        assertEquals(6, Main.oddOrEvenSolver(7, 7));
    }

    @Test
    void oddOrEvenSolver3() {
        assertEquals(2, Main.oddOrEvenSolver(8, 5));
    }

    @Test
    void oddOrEvenSolver4() {
        assertEquals(7, Main.oddOrEvenSolver(8, 4));
    }

    @Test
    void oddOrEvenSolver5() {
        assertEquals(2, Main.oddOrEvenSolver(1000000000000L, 500000000001L));
    }
}