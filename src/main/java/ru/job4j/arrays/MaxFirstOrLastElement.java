package ru.job4j.arrays;

public class MaxFirstOrLastElement {
    public static int getValue(int[] array) {
        int max = 0;
        if(array[0] > array[array.length - 1]) {
            max = array[0];
        }
        else {
            max = array[array.length - 1];
        }
        return max;
    }
}
