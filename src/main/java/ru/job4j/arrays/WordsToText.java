package ru.job4j.arrays;

public class WordsToText {
    public static String convert(String[] words) {
        StringBuilder str = new StringBuilder();
        String prefix = "";
        for(String word: words) {
            str.append(prefix);
            prefix = " ";
            str.append(word);


        }
        return str.toString();
    }
}
