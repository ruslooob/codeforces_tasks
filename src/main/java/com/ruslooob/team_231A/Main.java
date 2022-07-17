package com.ruslooob.team_231A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(teamSolver(matrix));
    }

    public static int teamSolver(int[][] matrix) {
        int solvesCount = 0;
        for (int[] ints : matrix) {
            int rowCount = 0;
            for (int j = 0; j < 3; j++) {
                if (ints[j] == 1) {
                    rowCount++;
                }
                if (rowCount == 2) {
                    solvesCount++;
                    break;
                }
            }

        }
        return solvesCount;
    }
}
