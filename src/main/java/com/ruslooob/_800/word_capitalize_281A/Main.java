package com.ruslooob._800.word_capitalize_281A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        System.out.println(wordCapitalizeSolver(inputStr));
    }

    public static String wordCapitalizeSolver(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
