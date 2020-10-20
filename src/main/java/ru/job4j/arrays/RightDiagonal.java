package ru.job4j.arrays;

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] res = new int[data[0].length];
        int index = data[0].length - 1;
        for (int i = 0; i < res.length; i++) {
            res[i] = data[i][index - i];
        }
        return res;
    }

}
