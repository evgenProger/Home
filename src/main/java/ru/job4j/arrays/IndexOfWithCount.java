package ru.job4j.arrays;

import java.util.Arrays;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int count = 0;
        int index = -1;
        for(int i = 0; i < string.length; i++) {
            if(string[i] == c) {
                count += 1;
            }
            if (count == number) {
                index = new String(string).indexOf(c, i);
            }
        }
        return index;
    }
}
