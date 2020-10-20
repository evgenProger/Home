package ru.job4j.loop;

public class DigitSum {
    public static int sum(int sum) {
        String str = String.valueOf(sum);
        int total = 0;
        for(int i = 0; i < str.length(); i++) {
            total = total + Integer.parseInt(Character.toString(str.charAt(i)));
        }
        return total;
    }
}
