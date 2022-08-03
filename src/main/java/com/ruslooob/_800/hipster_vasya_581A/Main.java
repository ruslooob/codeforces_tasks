package com.ruslooob._800.hipster_vasya_581A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        int[] resultArr = hipsterVasyaSolver(a, b);
        for (int i : resultArr) {
            sb.append(i);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }

    public static int[] hipsterVasyaSolver(int a, int b) {
        int firstResult = Math.min(a, b);
        return new int[]{firstResult, (a - firstResult) / 2 + (b - firstResult) / 2};
    }

}
