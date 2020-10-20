package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int count = 0;
        int s = section;
        while (s <= length) {
            s = s + section;
            count += 1;
        }
        return count;
    }
}
