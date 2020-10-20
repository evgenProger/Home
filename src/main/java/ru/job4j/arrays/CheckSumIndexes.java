package ru.job4j.arrays;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int[] arr = new int[data.length * data.length];
        int index = 0;
        int count = 0;
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                if(i + j == sum) {
                    data[i][j] = 0;
                    count++;

                }
                else  {
                    arr[index] = data[i][j];
                    index++;
                }
            }
        }
        return Arrays.copyOf(arr, arr.length - count);

    }
}
