package com.ruslooob._800.looking_for_simple_task_1030A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String inputStr = scanner.nextLine();
        System.out.println(lookingForSimpleTaskSolver(inputStr));
    }

    public static String lookingForSimpleTaskSolver(String inputStr) {
        return inputStr.contains("1") ? "HARD" : "EASY";
    }
}
