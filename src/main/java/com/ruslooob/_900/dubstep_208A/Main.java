package com.ruslooob._900.dubstep_208A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String songStr = scanner.next();
        System.out.println(dubstepSolver(songStr));
    }

    public static String dubstepSolver(String remixStr) {
        return remixStr.replaceAll("WUB", " ").trim();
    }
}
