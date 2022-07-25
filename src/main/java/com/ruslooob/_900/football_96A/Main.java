package com.ruslooob._900.football_96A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        System.out.println(footballSolver(inputStr));
    }

    public static String footballSolver(String str) {
            return str.contains("1".repeat(7)) || str.contains("0".repeat(7))
                    ? "YES"
                    : "NO";
    }
}
