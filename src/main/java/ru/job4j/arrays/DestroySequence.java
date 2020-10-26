package ru.job4j.arrays;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        int finish = seq.length - 1;
        int i = 0;
        while (i < 5) {
            seq[i] = '0';
            i++;
            seq[finish] = '1';
            finish--;
        }
        return seq;
    }
}
