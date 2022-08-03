package com.ruslooob._800.buy_shovel_732A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println(buyShovelSolver(k, r));
    }

    public static int buyShovelSolver(int k, int r) {
        for (int i = 1; i <= 10; i++) {
            if ((k * i) % 10 == 0 || (k * i) % 10 - r == 0) {
                return i;
            }
        }
        throw new RuntimeException("Not impossible");
    }
}
