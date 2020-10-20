package ru.job4j.arrays;

public class SwapRows {
    public static void swap(int[][] data, int src, int dest) {
        int m = data[0].length;
        int[] temp = new int[m];
        for (int i = 0; i < data[src].length; i++) {
            temp[i] = data[dest][i];
            data[dest][i] = data[src][i];
            data[src][i] = temp[i];

        }
    }
}
