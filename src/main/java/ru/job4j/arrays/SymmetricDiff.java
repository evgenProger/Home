package ru.job4j.arrays;

import java.util.Arrays;

import static java.lang.System.arraycopy;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int i = 0, j = 0, k =0;
        while (i < left.length && j < right.length) {
            if (left[i] == right[j]) {
                i++;
                j++;
            }
            else if (left[i] < right[j]) {
                res[k] = left[i];
                i++;
                k++;
            }
            else if (left[i] > right[j]) {
                res[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < left.length) {
            res[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            res[k] = right[j];
            j++;
            k++;
        }
        return Arrays.copyOf(res, k);
    }
}
