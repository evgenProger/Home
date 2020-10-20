package ru.job4j.arrays;

public class Merge {
    public static int[] marge(int[] left, int[] right) {
        int[] rs1 = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < rs1.length; k++) {
            if(i > left.length - 1) {
                rs1[k] = right[j];
                j++;
            }
            else if(j > right.length - 1) {
                rs1[k] = left[i];
                i++;
            }
            else if(left[i] < right[j]) {
                rs1[k] = left[i];
                i++;
            }
            else  {
                rs1[k] = right[j];
                j++;
            }

    }
        return rs1;
}
}
