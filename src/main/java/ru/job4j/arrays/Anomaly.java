package ru.job4j.arrays;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][2];
        int i = 0, j = 0;
        int index = 0;
        int count = 0;
        while (index < data.length) {

            if (data[index] >= up) {
                result[i][j] = index;
                j++;
                while (index + 1 < data.length &&  data[index + 1] >= up) {
                    index++;
                }
                result[i][j] = index;
                j = 0;
                index++;
                i++;
                count++;
            }

            if (data[index] <= down) {
                result[i][j] = index;
                j++;
                while (index + 1 < data.length && data[index + 1] <= down) {
                    index++;
                }
                result[i][j] = index;
                j = 0;
                i++;
                index++;
                count++;
            }
            index++;
        }
        return Arrays.copyOf(result, count);
    }
}
