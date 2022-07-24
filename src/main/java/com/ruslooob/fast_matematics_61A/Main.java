package com.ruslooob.fast_matematics_61A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstStr = scanner.nextLine();
        String secondStr = scanner.nextLine();
        printArray(fastMathematicsSolver(firstStr, secondStr));
    }

    public static int[] fastMathematicsSolver(String firstStr, String secondStr) {
        int[] resultArr = new int[firstStr.length()];
        for (int i = 0; i < firstStr.length(); i++) {
            int firstStrInt = Integer.parseInt(firstStr.substring(i, i + 1));
            int secondStrInt = Integer.parseInt(secondStr.substring(i, i + 1));
            if (Math.abs(firstStrInt - secondStrInt) == 1) {
                resultArr[i] = 1;
            } else {
                resultArr[i] = 0;
            }
        }
        return resultArr;
    }

    public static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int elem : arr) {
            sb.append(elem);
        }
        System.out.println(sb);
    }
}
