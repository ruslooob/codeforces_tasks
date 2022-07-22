package com.ruslooob.word_59A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        System.out.println(wordSolver(inputStr));
    }

    public static String wordSolver(String inputStr) {
        int upperCount = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            if (Character.isUpperCase(inputStr.charAt(i))) {
                upperCount++;
            }
        }
        int lowerCount = inputStr.length() - upperCount;
        return upperCount > lowerCount ? inputStr.toUpperCase() : inputStr.toLowerCase();
    }
}
