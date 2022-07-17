package com.ruslooob.next_round_158A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(nextRoundSolve(a, k));
    }

    public static int nextRoundSolve(int[] a, int k) {
        int nextRoundCount = 0;
        for (int element : a) {
            if (element >= a[k - 1] && element > 0) {
                nextRoundCount++;
            }
        }
        return nextRoundCount;
    }
}
