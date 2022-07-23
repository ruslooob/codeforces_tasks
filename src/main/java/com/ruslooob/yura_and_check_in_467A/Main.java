package com.ruslooob.yura_and_check_in_467A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] flatInfo = new int[n][2];
        for (int i = 0; i < n; i++) {
            flatInfo[i][0] = scanner.nextInt();
            flatInfo[i][1] = scanner.nextInt();
        }
        System.out.println(yuraAndCheckInSolver(flatInfo));
    }

    public static int yuraAndCheckInSolver(int[][] flatInfos) {
        int availableFlatsCounter = 0;
        for (int[] flatInfo : flatInfos) {
            if (flatInfo[1] - flatInfo[0] >= 2) {
                availableFlatsCounter++;
            }
        }
        return availableFlatsCounter;
    }
}
