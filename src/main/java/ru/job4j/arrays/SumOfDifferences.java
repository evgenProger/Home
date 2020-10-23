package ru.job4j.arrays;

public class SumOfDifferences {
    public static int sum(int[] sums) {
        int sum = 0;
        int dif;
        for(int i = 0; i < sums.length - 1; i++) {
            dif = sums[i] - sums[i + 1];
            sum = sum + dif;
        }
        return sum;
    }
}
