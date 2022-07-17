package com.ruslooob.bit_plus_plus_282A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        System.out.println(bitPlusPlusSolver(strings));
    }

    public static int bitPlusPlusSolver(String[] strings) {
        int x = 0;
        for (String str : strings) {
            if (str.contains("--")) {
                x -= 1;
            } else {
                x += 1;
            }
        }
        return x;
    }
}
