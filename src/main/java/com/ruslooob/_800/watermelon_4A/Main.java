package com.ruslooob._800.watermelon_4A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(watermelonSolver(n));
    }

    public static String watermelonSolver(int n) {
        return n > 3 && n % 2 == 0 ? "YES" : "NO";
    }
}
