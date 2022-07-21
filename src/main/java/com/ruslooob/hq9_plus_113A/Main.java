package com.ruslooob.hq9_plus_113A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        System.out.println(hq8PlusSolver(inputStr));
    }

    public static String hq8PlusSolver(String inputStr) {
        return inputStr.contains("H") || inputStr.contains("Q") || inputStr.contains("9")
                ? "YES"
                : "NO";
    }
}
