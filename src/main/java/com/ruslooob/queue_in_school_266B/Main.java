package com.ruslooob.queue_in_school_266B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        String queueStr = scanner.next();
        System.out.println(queueInSchoolSolver(n, t, queueStr));
    }

    public static String queueInSchoolSolver(int n, int t, String queueStr) {
        char[] children = queueStr.toCharArray();
        for (int j = 0; j < t; j++) {
            for (int i = children.length - 1; i > 0; i--) {
                if (children[i - 1] == 'B' && children[i] == 'G') {
                    swap(children, i, i - 1);
                    i--;
                }
            }
        }
        return String.valueOf(children);
    }

    public static void swap(char[] arr, int a, int b) {
        char tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
