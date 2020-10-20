package ru.job4j.arrays;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        StringBuilder sb = new StringBuilder();
        for (char c : string) {
            if (Character.isLetter(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString().toCharArray();
    }
}
