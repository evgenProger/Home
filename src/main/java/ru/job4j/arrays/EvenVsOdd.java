package ru.job4j.arrays;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int sum_even = 0, sum_not_even = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                sum_even = sum_even + players[i];
            }
            else {
                sum_not_even = sum_not_even + players[i];
            }
        }
        if (sum_even == sum_not_even) {
            return 0;
        }
        return sum_even > sum_not_even ? 1 : 2;
    }
}
