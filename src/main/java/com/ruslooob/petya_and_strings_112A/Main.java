package com.ruslooob.petya_and_strings_112A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println(petyaAndStringsSolver(str1, str2));
    }

    public static int petyaAndStringsSolver(String str1, String str2) {
        int cmpResult = str1.toLowerCase().compareTo(str2.toLowerCase());
        if (cmpResult > 0) {
            return 1;
        } else if (cmpResult < 0) {
            return -1;
        }
        return cmpResult;
    }
}
