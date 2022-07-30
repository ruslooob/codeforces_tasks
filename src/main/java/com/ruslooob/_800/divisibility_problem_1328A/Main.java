package com.ruslooob._800.divisibility_problem_1328A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        int[] resultArr = divisibilityProblemSolver(arr);
        for (int resultElem : resultArr) {
            System.out.println(resultElem);
        }
    }

    public static int[] divisibilityProblemSolver(int[][] arr) {
        int[] resultArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = getStepsToDivide(arr[i][0], arr[i][1]);
        }
        return resultArr;
    }

    public static int getStepsToDivide(int a, int b) {
        return a % b == 0 ? 0 : Math.abs(b - a % b);
    }
}
