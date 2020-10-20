package ru.job4j.arrays;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int col = 1;
        for(int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < count; j++) {
                triangle[i][j] = col++;
            }
        }
        return triangle;
    }
}
