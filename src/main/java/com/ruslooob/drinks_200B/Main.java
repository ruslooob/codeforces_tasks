package com.ruslooob.drinks_200B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] percentages = new int[n];
        for (int i = 0; i < n; i++) {
            percentages[i] = scanner.nextInt();
        }
        System.out.println(drinksSolver(percentages));
    }

    public static double drinksSolver(int[] percentages) {
        double sum = 0;
        for (int percentage : percentages) {
            sum += percentage;
        }
        return sum / percentages.length;
    }
}
