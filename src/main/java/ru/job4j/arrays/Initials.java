package ru.job4j.arrays;

public class Initials {
    public static String convert(String[] fio) {
        StringBuilder str = new StringBuilder();
        for(int i = 1; i < fio.length; i++) {
            str.append(fio[i].charAt(0));
            str.append(".");
        }
        return fio[0] + " " + str.toString();
    }
}
