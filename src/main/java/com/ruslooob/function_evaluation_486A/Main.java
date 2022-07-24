package com.ruslooob.function_evaluation_486A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(functionEvaluationSolver(n));
    }

    public static long functionEvaluationSolver(long n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return (-1) + -1 * ((n - 1) / 2);
        }
    }
}
