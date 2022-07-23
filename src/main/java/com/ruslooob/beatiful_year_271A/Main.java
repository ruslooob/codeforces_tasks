package com.ruslooob.beatiful_year_271A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        System.out.println(beautifulYearSolver(y));
    }

    public static int beautifulYearSolver(int y) {
        int potentialBeautifulYear = y;
        while (true) {
            potentialBeautifulYear++;
            if (isBeautifulYear(potentialBeautifulYear)) {
                return potentialBeautifulYear;
            }
        }
    }

    public static boolean isBeautifulYear(int year) {
        String yearStr = String.valueOf(year);
        for (int i = 0; i < yearStr.length() - 1; i++) {
            for (int j = i + 1; j < yearStr.length(); j++) {
                if (yearStr.charAt(i) == yearStr.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
