package ru.job4j.arrays;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int size = 2 + middle.length / 2 + right.length / 2;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                result[i] = left[i];
            }
            if (i % 2 == 0) {
                result[i + 1] = right[i];
            }
            else {
                result[i + 1] = middle[i];
            }
            if (i == left.length - 1) {
                result[result.length - 1] = left[left.length - 1];
                break;
            }

        }
        return result;
    }
}
