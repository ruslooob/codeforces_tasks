package com.ruslooob._900.odd_and_even_318A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        System.out.println(oddOrEvenSolver(n, k));
    }

    public static long oddOrEvenSolver(long n, long k) {
        long ceil = (long) Math.ceil(n / 2.);
        if (k <= ceil) {
            return findNthOddNumber(k);
        } else {
            return findNthEvenNumber(k - ceil);
        }
    }

    public static long findNthOddNumber(long n) {
        return 1 + 2 * (n - 1);
    }

    public static long findNthEvenNumber(long n) {
        return 2 + 2 * (n - 1);
    }
}
