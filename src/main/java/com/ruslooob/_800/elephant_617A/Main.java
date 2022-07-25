package com.ruslooob._800.elephant_617A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(elephantSolver(x));
    }

    public static int elephantSolver(int x) {
        return (int) Math.ceil(x / 5.);
    }
}
