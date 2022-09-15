package com.ruslooob._800.i_love_you_username_155A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            marks[i] = scanner.nextInt();
        }
        System.out.println(Main.iLoveYouUserNameSolver(marks));
    }

    public static int iLoveYouUserNameSolver(int[] marks) {
        int highestMark = marks[0];
        int lowestMark = marks[0];
        int amazingCount = 0;
        for (int i = 0; i < marks.length; i++) {
            if (lowestMark > marks[i]) {
                lowestMark = marks[i];
                amazingCount++;
            } else if (highestMark < marks[i]) {
                highestMark = marks[i];
                amazingCount++;
            }
        }
        return amazingCount;
    }

}