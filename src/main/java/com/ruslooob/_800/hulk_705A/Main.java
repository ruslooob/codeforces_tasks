package com.ruslooob._800.hulk_705A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(hulkSolver(n));
    }

    public static String hulkSolver(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append("I hate");
            } else {
                sb.append("I love");
            }
            if (i != n - 1) {
                sb.append(" that ");
            }
        }
        sb.append(" it");
        return sb.toString();
    }
}
