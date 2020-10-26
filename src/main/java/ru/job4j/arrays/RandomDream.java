package ru.job4j.arrays;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        int count = 1;
        boolean flag = false;
        String prize = null;
        for (int j = 0; j < count; j++) {
            for (int i = 0; i < prizes.length; i++) {
                if (count == num) {
                    prize = prizes[i];
                    flag = true;
                    break;
                }
                count++;
            }
            if (flag) {
                break;
            }
        }
        return prize;
    }
}
