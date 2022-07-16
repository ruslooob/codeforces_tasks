package com.ruslooob.watermelon;

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
