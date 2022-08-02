package com.ruslooob._900.puzzles_337A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void puzzlesSolver1() {
        assertEquals(0, Main.puzzlesSolver(2, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 12}));
    }

    @Test
    void puzzlesSolver2() {
        assertEquals(5, Main.puzzlesSolver(4, new int[]{10, 12, 10, 7, 5, 22}));
    }

    @Test
    void puzzlesSolver3() {
        assertEquals(5, Main.puzzlesSolver(0, new int[]{4, 4}));
    }

}