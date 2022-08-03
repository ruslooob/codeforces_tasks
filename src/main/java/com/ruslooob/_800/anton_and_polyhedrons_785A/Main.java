package com.ruslooob._800.anton_and_polyhedrons_785A;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] figures = new String[n];
        for (int i = 0; i < n; i++) {
            figures[i] = scanner.nextLine();
        }
        System.out.println(antonAndPolyhedronsSolver(figures));
    }

    public static int antonAndPolyhedronsSolver(String[] figures) {
        Map<String, Integer> figureEdges = Map.of("Tetrahedron", 4, "Cube", 6, "Octahedron", 8, "Dodecahedron", 12, "Icosahedron", 20);
        int counter = 0;
        for (String figure : figures) {
            counter += figureEdges.get(figure);
        }
        return counter;
    }

}
