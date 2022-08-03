package com.ruslooob._800.matches_268A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        System.out.println(matchesSolver(arr));
    }

    public static int matchesSolver(int[][] arr) {
        int resultCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i][0] == arr[j][1]) {
                        resultCounter++;
                    }
                }
            }
        }
        return resultCounter;
    }
}
