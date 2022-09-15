package com.ruslooob._800.win_lotery_996A;

import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(winLotterySolver(n));
    }

    public static int winLotterySolver(int n) {
        int remain = n;
        int billsCount = 0;
        int[] bills = new int[]{1, 5, 10, 20, 100};
        while (remain >= 0) {
            for (int i = bills.length - 1; i >= 0; i--) {
                if (remain - bills[i] >= 0) {
                    remain -= bills[i];
                    billsCount++;
                    break;
                }
            }
            if (remain == 0) {
                return billsCount;
            }
        }
        throw new RuntimeException("it's not impossible");
    }

}
