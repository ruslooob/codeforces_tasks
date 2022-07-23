package com.ruslooob.theatre_square_1A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();
        System.out.println(theatreSquareSolver(n, m, a));
    }

    public static long theatreSquareSolver(long n, long m, long a) {
        return (long) Math.ceil(n / (double) a) * (long) Math.ceil(m / (double) a);
    }
}
