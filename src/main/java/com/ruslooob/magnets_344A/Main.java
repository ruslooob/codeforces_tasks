package com.ruslooob.magnets_344A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] signs = new String[n];
        for (int i = 0; i < n; i++) {
            signs[i] = scanner.nextLine();
        }
        System.out.println(magnetSolver(signs));
    }

    public static int magnetSolver(String[] signs) {
        int magnetIslandsCount = 0;
        for (int i = 0; i < signs.length - 1; i++) {
            if (signs[i].charAt(1) == signs[i + 1].charAt(0)) {
                magnetIslandsCount++;
            }
        }
        return magnetIslandsCount + 1;
    }
}
