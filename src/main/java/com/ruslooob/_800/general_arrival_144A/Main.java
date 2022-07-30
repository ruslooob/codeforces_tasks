package com.ruslooob._800.general_arrival_144A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }
        System.out.println(generalArrivalSolver(heights));
    }

    public static int generalArrivalSolver(int[] heights) {
        int maxIndex = getMaxElemIndex(heights);
        int minIndex = getMinElemIndex(heights);
        return minIndex > maxIndex
                ? maxIndex + (heights.length - 1 - minIndex)
                : maxIndex + (heights.length - 1 - minIndex) - 1;
    }

    /* returns min index of max elements in array*/
    public static int getMaxElemIndex(int[] arr) {
        int maxIndex = 0;
        int max = arr[maxIndex];
        for (int i = maxIndex + 1; i < arr.length; i++) {
            if (arr[i] > max) {
                maxIndex = i;
                max = arr[maxIndex];
            }
        }
        return maxIndex;
    }
    /* returns max index of min elements in arrays*/
    public static int getMinElemIndex(int[] arr) {
        int minIndex = 0;
        int min = arr[minIndex];
        for (int i = minIndex + 1; i < arr.length; i++) {
            if (arr[i] <= min) {
                minIndex = i;
                min = arr[minIndex];
            }
        }
        return minIndex;
    }
}
