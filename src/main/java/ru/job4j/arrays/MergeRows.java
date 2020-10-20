package ru.job4j.arrays;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int n = data.length;
        int m = data[0].length;
        int[] res = new int[n * m];
        int index = 0;
        for(int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                res[index] = data[i][j];
                index++;
            }

        }
        return res;
    }
}
