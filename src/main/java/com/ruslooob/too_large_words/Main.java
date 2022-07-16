package com.ruslooob.too_large_words;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> words = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            words.add(scanner.next());
        }
        List<String> shortedWords = tooLargeWordsSolver(words);

        for (String shortedWord : shortedWords) {
            System.out.println(shortedWord);
        }
    }

    public static List<String> tooLargeWordsSolver(List<String> words) {
        return words.stream()
                .map(word -> {
                    int len = word.length();
                    return len > 10
                            ? String.format("%s", word.charAt(0) + String.valueOf(len - 2) + word.charAt(len - 1))
                            : word;
                })
                .toList();
    }
}
