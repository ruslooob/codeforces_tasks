package com.ruslooob._800.learning_from_mathematics_472A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int elem : learningFromMathematicsSolver(n)) {
            sb.append(elem);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

    public static int[] learningFromMathematicsSolver(int n) {
        for (int x = 2; x < n - 1; x++) {
            int y = n - x;
            if (isComplexNumber(x) && isComplexNumber(y)) {
                return new int[]{x, y};
            }
        }
        throw new RuntimeException("its not impossible");
    }

    public static boolean isComplexNumber(int n) {
        return !isPrimeNumber(n);
    }

    public static boolean isPrimeNumber(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
