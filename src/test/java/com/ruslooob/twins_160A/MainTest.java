package com.ruslooob.twins_160A;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void twinsSolver1() {
        List<Integer> coins  = Arrays.asList(3, 3);
        assertEquals(2, Main.twinsSolver(coins));
    }

    @Test
    void twinsSolver2() {
        List<Integer> coins = Arrays.asList(2,1 ,2);
        assertEquals(2, Main.twinsSolver(coins));
    }

    @Test
    void twinsSolver3() {
        List<Integer> coins = Arrays.asList(10, 10, 5, 5, 5, 5, 1);
        assertEquals(3, Main.twinsSolver(coins));
    }

}