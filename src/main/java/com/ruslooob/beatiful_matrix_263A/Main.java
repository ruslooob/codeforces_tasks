package com.ruslooob.beatiful_matrix_263A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(beautifulMatrixSolver(matrix));
    }

    public static int beautifulMatrixSolver(int[][] matrix) {
        int x = -1, y = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 1) {
                    x = i;
                    y = j;
                }
            }
        }
        return Math.abs(x - 2) + Math.abs(y - 2);
    }
}
