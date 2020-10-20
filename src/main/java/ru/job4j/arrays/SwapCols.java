package ru.job4j.arrays;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        int m = data[dst].length;
        int[] temp = new int[m];
        for(int i = 0; i < data[src].length; i++) {
            temp[i] = data[i][dst];
            data[i][dst] = data[i][src];
            data[i][src] = temp[i];
        }
    }
}
