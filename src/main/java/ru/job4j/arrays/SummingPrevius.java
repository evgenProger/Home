package ru.job4j.arrays;

public class SummingPrevius {
    public static int[] calculate(int a, int b, int n) {
        int[] arr = new int[n];
        arr[0] = a;
        arr[1] = b;
        arr[2] = arr[0] + arr[1];
        int k = 0;
        for (int i = 3; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 1];
        }
        return arr;
    }
}
