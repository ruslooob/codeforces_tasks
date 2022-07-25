package com.ruslooob._800.laying_dominoes_50A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(layingDominoesSolver(m, n));
    }

    public static int layingDominoesSolver(int m, int n) {
        return m * n / 2;
    }
}
