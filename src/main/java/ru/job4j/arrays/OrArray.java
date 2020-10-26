package ru.job4j.arrays;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < left.length; i++) {
            result[i] = left[i];
            count++;
        }
        for (int j = 0; j < result.length; j++) {
            for (int k = 0; k < right.length ; k++) {
                if (result[j] != right[k] && result[k] != right[k]) {
                    result[count] = right[k];
                    count++;
                    if (count == result.length) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag) {
                break;
            }
    }

        return count == 0 ? Arrays.copyOf(result, 0) : Arrays.copyOf(result, count);
    }
}
