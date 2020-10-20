package ru.job4j.arrays;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int count_current = 1;
        int count_previous = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] >= array[i - 1] && array[i - 1] <= array[array.length -  i - 1]) {
                count_current += 1;
                if (count_previous < count_current) {
                    count_previous = count_current;
                }
                else {
                    count_current = 1;
                }

            }
        }
        return Math.max(count_previous, count_current);
    }
}
