package com.ruslooob._800.incorrect_subtraction_977A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(incorrectSubtractionSolver(n, k));
    }

    public static long incorrectSubtractionSolver(long n, int k) {
        for (int i = 0; i < k; i++) {
            if (n % 10 != 0) {
                n--;
            } else {
                n /= 10;
            }
        }
        return n;
    }
}
