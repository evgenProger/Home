package ru.job4j.arrays;

import java.util.Arrays;

public class ArrayWithoutEvenElement {
    public static int[] changeData(int[] data) {
        int count = 0;
        int index = 0;
        int[] result = new int[data.length];
        for (int datum : data) {
            if (datum % 2 == 0) {
                continue;
            }
            result[index] = datum;
            count++;
            index++;
        }
        return Arrays.copyOf(result, count);
    }
}
