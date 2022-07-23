package com.ruslooob.vanya_and_fence_677A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(vanyaAndFenceSolver(h, a));
    }

    public static int vanyaAndFenceSolver(int h, int[] a) {
        int width = a.length;
        for (int height : a) {
            if (height > h) {
                width++;
            }
        }
        return width;
    }
}
