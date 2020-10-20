package ru.job4j.loop;

public class OddCount {
    public static int count(int a, int b) {
        int k = 0;
        for(int i = a; i<= b; i++) {
            if(i % 2 == 1) {
                k =+ 1;
            }
        }
        return k;
    }
}
