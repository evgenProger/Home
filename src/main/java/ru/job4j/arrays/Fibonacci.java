package ru.job4j.arrays;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        boolean rs1 = true;
        for (int i = 0; i < data.length - 2; i++) {
            if (data[i] + data[i + 1] != data[data.length - (data.length - i - 2)]) {
                rs1 = false;
                break;
            }
        }
        return rs1;
    }
}
