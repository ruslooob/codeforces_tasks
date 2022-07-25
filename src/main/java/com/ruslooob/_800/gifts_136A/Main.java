package com.ruslooob._800.gifts_136A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] resultArr = giftsSolver(arr);
        printArray(resultArr);
    }

    public static int[] giftsSolver(int[] arr) {
        int[] resultArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            resultArr[elem - 1] = i + 1;
        }
        return resultArr;
    }

    public static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int elem : arr) {
            sb.append(elem);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
