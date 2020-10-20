package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int i = 0;
        while (d <= n) {
            n = n - d;
            i++;
        }
        return n;
    }


}
