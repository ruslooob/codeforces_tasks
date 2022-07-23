package com.ruslooob.anton_and_danik_734A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String inputStr = scanner.next();
        System.out.println(antonAndDanikSolver(inputStr));
    }

    public static String antonAndDanikSolver(String inputStr) {
        int gamesCount = inputStr.length();
        int antonWinsCount = 0;
        for (char ch : inputStr.toCharArray()) {
            if (ch == 'A') {
                antonWinsCount++;
            }
        }
        int danikWinsCount = gamesCount - antonWinsCount;
        if (antonWinsCount == danikWinsCount) {
            return "Friendship";
        } else if (antonWinsCount > danikWinsCount) {
            return "Anton";
        } else {
            return "Danik";
        }
    }
}
