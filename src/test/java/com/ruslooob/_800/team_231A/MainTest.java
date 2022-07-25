package com.ruslooob._800.team_231A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void teamSolver() {
        int[][] given = new int[][]{
                new int[]{1, 1, 0},
                new int[]{1, 1, 1},
                new int[]{1, 0, 0}
        };
        assertEquals(2, Main.teamSolver(given));
    }
}