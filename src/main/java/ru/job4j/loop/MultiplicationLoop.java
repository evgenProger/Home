package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int multi = a;
        for (int i = a + 1; i <= b; i++) {
            multi = multi * i;

        }
        return multi;
    }
}
