package com.ruslooob._800.buy_shovel_732A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void buyShovelSolver() {
        assertEquals(9, Main.buyShovelSolver(117, 3));
    }

    @Test
    void buyShovelSolver2() {
        assertEquals(2 , Main.buyShovelSolver(15, 2));
    }


}