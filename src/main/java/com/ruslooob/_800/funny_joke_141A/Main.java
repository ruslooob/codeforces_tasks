package com.ruslooob._800.funny_joke_141A;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String secondName = scanner.next();
        String heapNames = scanner.next();
        System.out.println(funnyJokeSolver(firstName, secondName, heapNames));
    }

    public static String funnyJokeSolver(String firstName, String secondName, String heapNames) {
        char[] firstCharArr = firstName.toCharArray();
        char[] secondCharArr = secondName.toCharArray();
        char[] heapNamesArr = heapNames.toCharArray();
        char[] generalNamesArr = new char[firstCharArr.length + secondCharArr.length];

        System.arraycopy(firstCharArr, 0, generalNamesArr, 0, firstCharArr.length);
        System.arraycopy(secondCharArr, 0, generalNamesArr, firstCharArr.length, secondCharArr.length);

        Arrays.sort(generalNamesArr);
        Arrays.sort(heapNamesArr);
        return Arrays.equals(generalNamesArr, heapNamesArr) ? "YES" : "NO";
    }

}
