package ru.job4j.lambda;

import java.util.function.Consumer;

public class ConsumerAndThen {
    public static Consumer<String> consumer(String input) {
        Consumer<String> print = i -> System.out.print(input);
        Consumer<String> print2 = i -> System.out.println();
        Consumer<String> res = print.andThen(print2);
        return res;
    }

}
