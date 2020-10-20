package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        boolean f = true;
        String str = Integer.toString(i);
        for(int j = 0; j < str.length() / 2; j++ ) {
            if(str.charAt(j) != str.charAt(str.length() - j - 1)) {
                f = false;
                break;
            }
        }
        return f;
    }
}
