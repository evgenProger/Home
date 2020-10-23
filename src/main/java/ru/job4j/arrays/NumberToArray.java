package ru.job4j.arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        int index = 0;
        String str = String.valueOf(number);
        int[] res = new int[str.length()];
        for (int i = str.length() - 1; i >= 0; i--) {
            res[index] = Integer.parseInt(Character.toString(str.charAt(i)));
            index++;
        }
        return res;
    }
}
