package com.ruslooob.tram_116A;

import java.util.Scanner;


public class Main {
    static class TramPair {
        public int exited;
        public int entered;

        public TramPair(int exited, int entered) {
            this.exited = exited;
            this.entered = entered;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TramPair[] tramPairs = new TramPair[n];
        for (int i = 0; i < n; i++) {
            tramPairs[i] = new TramPair(scanner.nextInt(), scanner.nextInt());
        }
        System.out.println(tramSolver(tramPairs));
    }

    public static int tramSolver(TramPair[] tramPairs) {
        int maxPeopleCount = 0;
        int peopleCount = 0;
        for (TramPair tramPair : tramPairs) {
            peopleCount -= tramPair.exited;
            peopleCount += tramPair.entered;
            if (peopleCount > maxPeopleCount) {
                maxPeopleCount = peopleCount;
            }
        }
        return maxPeopleCount;
    }
}

