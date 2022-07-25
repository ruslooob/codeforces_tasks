package com.ruslooob._800.string_excercises_118A;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        System.out.println(stringExerciseSolver(inputStr));
    }

    public static String stringExerciseSolver(String inputStr) {
        Set<Character> vowels = new HashSet<>(List.of('a', 'o', 'y', 'e', 'i', 'u'));
        String lowerInputStr = inputStr.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char ch : lowerInputStr.toCharArray()) {
            if (!vowels.contains(ch)) {
                sb.append(".");
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
