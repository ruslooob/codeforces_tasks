package com.ruslooob._800.almost_lucky_number_110A;

import java.util.Scanner;

public class Standard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        System.out.println(almostLuckyNumberSolver(n));
    }

    public static String almostLuckyNumberSolver(String n) {
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            String ch = n.substring(i, i + 1);
            if (isLuckyNumber(ch)) {
                count++;
            }
        }
        return isLuckyNumber(Integer.toString(count)) ? "YES" : "NO";
    }

    private static boolean isLuckyNumber(String strNum) {
        for (char ch : strNum.toCharArray()) {
            if (ch != '4' && ch != '7') {
                return false;
            }
        }
        return true;
    }
}