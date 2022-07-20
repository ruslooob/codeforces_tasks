package com.ruslooob.girl_or_boy_236A;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        System.out.println(girlOrBoySolver(inputStr));
    }

    public static String girlOrBoySolver(String inputStr) {
        Set<Character> letters = new HashSet<>();
        for (char ch : inputStr.toCharArray()) {
            letters.add(ch);
        }
        return letters.size() % 2 == 1 ? "IGNORE HIM!" : "CHAT WITH HER!";
    }
}
