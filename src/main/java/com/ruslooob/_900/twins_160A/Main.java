package com.ruslooob._900.twins_160A;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// todo проверить, что быстрее работает, считывать через scanner.next или один раз считать через scanner.nextLine, а потом сделать split
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> coins = new ArrayList<>();
        for (int i = 0 ; i < n; i++) {
            coins.add(scanner.nextInt());
        }
        System.out.println(twinsSolver(coins));
    }

    public static int twinsSolver(List<Integer> coins) {
        coins.sort(Comparator.reverseOrder());
        int firstTwinSum = 0;
        int firstTwinCoinsCounter = 0;
        for (Integer coin : coins) {
            firstTwinSum += coin;
            firstTwinCoinsCounter++;
            if (firstTwinSum > sublistSum(coins, firstTwinCoinsCounter)) {
                return firstTwinCoinsCounter;
            }
        }
        throw new RuntimeException("it won't come here");
    }

    public static int sublistSum(List<Integer> list, int beginIndex) {
        int sum = 0;
        for (int i = beginIndex; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
