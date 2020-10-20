package ru.job4j.arrays;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int count = 0;
        for (int datum : data) {
            if (value == datum) {
                count++;
            }
        }
        return count <= data.length / 2;
    }

}
