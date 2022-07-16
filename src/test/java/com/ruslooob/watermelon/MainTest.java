package com.ruslooob.watermelon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void watermelonSolver8() {
        assertEquals("YES", Main.watermelonSolver(8));
    }

    @Test
    void watermelonSolver4() {
        assertEquals("YES", Main.watermelonSolver(4));
    }
}