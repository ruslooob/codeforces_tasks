package com.ruslooob._800.stones_on_table_266A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String inputStr = scanner.next();
        System.out.println(stonesOnTableSolver(inputStr));
    }

    public static int stonesOnTableSolver(String inputStr) {
        int counter = 0;
        char[] charArray = inputStr.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                counter++;
            }
        }
        return counter;
    }
}
