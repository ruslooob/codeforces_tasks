package com.ruslooob._800.translate_41A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.next();
        String s = scanner.next();
        System.out.println(translateSolver(t, s));
    }

    public static String translateSolver(String t, String s) {
        return new StringBuilder(t).reverse().toString().equals(s) ? "YES" : "NO";
    }
}
