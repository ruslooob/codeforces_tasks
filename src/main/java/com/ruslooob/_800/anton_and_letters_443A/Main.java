package com.ruslooob._800.anton_and_letters_443A;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letters = scanner.nextLine();
        System.out.println(antonAndLettersSolver(letters));
    }

    public static int antonAndLettersSolver(String letters) {
        Set<Character> unqLetters = new HashSet<>();
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            if (Character.isLetter(letter)) {
                unqLetters.add(letter);
            }
        }
        return unqLetters.size();
    }
}
