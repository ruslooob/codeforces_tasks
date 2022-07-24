package com.ruslooob.dont_make_my_horseshoes_laugh_228A;

import java.util.Scanner;

public class Main {
    public static final int ARR_LENGTH = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] colorDigits = new int[ARR_LENGTH];
        for (int i = 0; i < ARR_LENGTH; i++) {
            colorDigits[i] = scanner.nextInt();
        }
        System.out.println(dontMakeMyHorseshoesLaughSolver(colorDigits));
    }

    public static int dontMakeMyHorseshoesLaughSolver(int[] colorDigits) {
        int[] uniqColorDigits = new int[colorDigits.length];
        int uniqColorCursor = 0;
        for (int colorDigit : colorDigits) {
            if (!arrayContains(uniqColorDigits, colorDigit)) {
                uniqColorDigits[uniqColorCursor++] = colorDigit;
            }
        }
        return ARR_LENGTH - realArrayLength(uniqColorDigits);
    }

    public static boolean arrayContains(int[] arr, int a) {
        for (int elem : arr) {
            if (a == elem) {
                return true;
            }
        }
        return false;
    }

    public static int realArrayLength(int[] arr) {
        int counter = 0;
        for (int elem : arr) {
            if (elem != 0) {
                counter++;
            }
        }
        return counter;
    }
}
