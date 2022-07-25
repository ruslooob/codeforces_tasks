package com.ruslooob._800.queue_in_school_266B;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void queueInSchoolSolver1() {
        Assertions.assertEquals("GBGGB", Main.queueInSchoolSolver(5, 1, "BGGBG"));
    }

    @Test
    void queueInSchoolSolver2() {
        assertEquals("GGBGB", Main.queueInSchoolSolver(5, 2, "BGGBG"));
    }

    @Test
    void queueInSchoolSolver3() {
        assertEquals("GGGB", Main.queueInSchoolSolver(4, 1, "GGGB"));
    }

    @Test
    void queueInSchoolSolver4() {
        assertEquals("BB", Main.queueInSchoolSolver(2, 1, "BB"));
    }

    @Test
    void queueInSchoolSolver5() {
        assertEquals("GB", Main.queueInSchoolSolver(2, 1, "BG"));
    }

    @Test
    void queueInSchoolSolver6() {
        assertEquals("GBBGBB", Main.queueInSchoolSolver(6, 2, "BBGBBG"));
    }
}