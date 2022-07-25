package com.ruslooob._800.mathematics_rushing_rescue_339A;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String task = scanner.next();
        System.out.println(mathematicsRushingRescueSolver(task));
    }

    /*todo улучшить решение*/
    public static String mathematicsRushingRescueSolver(String task) {
        List<String> split = Arrays.asList(task.split("[+]"));
        split.sort(String::compareTo);
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            sb.append(s);
            sb.append("+");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
