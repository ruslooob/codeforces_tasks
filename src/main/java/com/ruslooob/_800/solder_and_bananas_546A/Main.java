package com.ruslooob._800.solder_and_bananas_546A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        System.out.println(solderAndBananasSolver(k, n, w));
    }

    public static int solderAndBananasSolver(int k, int n, int w) {
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum += i * k;
        }
        return sum > n ? sum - n : 0;
    }
}
