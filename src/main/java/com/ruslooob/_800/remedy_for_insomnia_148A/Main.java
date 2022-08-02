package com.ruslooob._800.remedy_for_insomnia_148A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] klmn = new int[4];
        for (int i = 0; i < 4; i++) {
            klmn[i] = scanner.nextInt();
        }
        int d = scanner.nextInt();
        System.out.println(remedyForInsomniaSolver(klmn, d));
    }

    public static int remedyForInsomniaSolver(int[] klmn, int d) {
        int affectedDragons = 0;
        for (int i = 1; i <= d; i++) {
            for (int j = 0; j < klmn.length; j++) {
                if (i % klmn[j] == 0) {
                    affectedDragons++;
                    break;
                }
            }
        }
        return affectedDragons;
    }
}
