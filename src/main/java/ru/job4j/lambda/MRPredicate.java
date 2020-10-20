package ru.job4j.lambda;

import java.util.function.Predicate;

public class MRPredicate {
    public static Predicate predicate() {
        Predicate<String> pr = String::isEmpty;
        return pr;
    }
}
