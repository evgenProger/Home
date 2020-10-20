package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder sb = new StringBuilder(s);
        if(s.isEmpty()) {
            return "empty";
        }
        else if(s.length() < 4) {
            return s;

        }
        else if (s.length() > 4) {
            for(int i = 0; i < s.length(); i++) {
                if(s.length() - i - 1 >= 4) {
                    sb.setCharAt(i, '#');
                }
            }
        }
        return sb.toString();
    }
}
