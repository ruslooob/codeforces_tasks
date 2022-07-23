package com.ruslooob.almost_lucky_number_110A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        System.out.println(almostLuckyNumberSolver(n));
    }

    public static String almostLuckyNumberSolver(String n) {
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (isLuckyChar(ch)) {
                count++;
            }
        }
        return isLuckyNumber(Integer.toString(count)) ? "YES" : "NO";
    }

    private static boolean isLuckyNumber(String n) {
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (!isLuckyChar(ch)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isLuckyChar(char ch) {
        return ch == '4' || ch == '7';
    }
}