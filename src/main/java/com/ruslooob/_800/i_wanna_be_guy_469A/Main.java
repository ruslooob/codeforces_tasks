package com.ruslooob._800.i_wanna_be_guy_469A;

import java.util.Arrays;
import java.util.Scanner;

//todo solver with set
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int firstGameArrLen = scanner.nextInt();
        int[] firstGameArr = new int[firstGameArrLen];
        for (int i = 0; i < firstGameArrLen; i++) {
            firstGameArr[i] = scanner.nextInt();
        }
        int secondGameArrLen = scanner.nextInt();
        int[] secondGameArr = new int[secondGameArrLen];
        for (int i = 0; i < secondGameArrLen; i++) {
            secondGameArr[i] = scanner.nextInt();
        }
        System.out.println(iWannaBeGuySolver(n, firstGameArr, secondGameArr));
    }

    public static String iWannaBeGuySolver(int levelsCount, int[] firstGameArr, int[] secondGameArr) {
        int totalLen = firstGameArr.length + secondGameArr.length;
        int[] commonGameArr = new int[totalLen];
        for (int i = 0; i < firstGameArr.length; i++) {
            commonGameArr[i] = firstGameArr[i];
        }
        for (int i = firstGameArr.length; i < totalLen; i++) {
            commonGameArr[i] = secondGameArr[i - firstGameArr.length];
        }
        Arrays.sort(commonGameArr);
        for (int i = 0; i < commonGameArr.length - 1; i++) {
            if (commonGameArr[i + 1] - commonGameArr[i] > 1) {
                return "Oh, my keyboard!";
            }
        }
        if (firstGameArr.length == 0 && secondGameArr.length == 0) {
            return "Oh, my keyboard!";
        }
        if (commonGameArr[0] != 1 || commonGameArr[totalLen - 1] != levelsCount) {
            return "Oh, my keyboard!";
        }
        return "I become the guy.";
    }
}
