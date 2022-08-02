package com.ruslooob._900.puzzles_337A;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] puzzles = new int[m];
        for (int i = 0; i < m; i++) {
            puzzles[i] = scanner.nextInt();
        }
        System.out.println(puzzlesSolver(n, puzzles));
    }

    public static int puzzlesSolver(int n, int[] puzzles) {
        Arrays.sort(puzzles);
        int minPuzzleDiff = puzzles[n - 1] - puzzles[0];
        for (int i = 0; i < puzzles.length - n + 1; i++) {
            int diff = puzzles[i + n - 1] - puzzles[i];
            if (diff < minPuzzleDiff) {
                minPuzzleDiff = diff;
            }
        }
        return minPuzzleDiff;
    }
}
