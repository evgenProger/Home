package ru.job4j.arrays;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if(left[i] == right[j]) {
                    result[count] = left[i];
                    count++;
                }
            }
        }
        return Arrays.copyOf(result, count);
    }
}
