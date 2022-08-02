package com.ruslooob._900.kefa_and_first_steps_580A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] steps = new int[n];
        for (int i = 0; i < n; i++) {
            steps[i] = scanner.nextInt();
        }
        System.out.println(kefaAndFirstStepsSolver(steps));
    }

    public static int kefaAndFirstStepsSolver(int[] steps) {
        int ascStepsCount = 1;
        int maxAscStepsCount = 1;
        for (int i = 0; i < steps.length - 1; i++) {
            if (steps[i] <= steps[i + 1]) {
                ascStepsCount++;
            } else {
                if (ascStepsCount > maxAscStepsCount) {
                    maxAscStepsCount = ascStepsCount;
                }
                ascStepsCount = 1;
            }
        }

        return Math.max(maxAscStepsCount, ascStepsCount);
    }

}
