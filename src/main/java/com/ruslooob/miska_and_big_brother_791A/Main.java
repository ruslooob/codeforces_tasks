package com.ruslooob.miska_and_big_brother_791A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(miskaAndBigBrotherSolver(a, b));
    }

    public static int miskaAndBigBrotherSolver(int a, int b) {
        int i;
        for (i = 1; ;i++) {
            a *= 3;
            b *= 2;
            if (a > b) {
                return i;
            }
        }
    }
}
