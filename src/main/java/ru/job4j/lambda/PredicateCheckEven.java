package ru.job4j.lambda;

import java.util.function.Predicate;

public class PredicateCheckEven {
    public static boolean check(int num) {
        Predicate<Integer> predicate1 = i -> i % 2 == 0;
        Predicate<Integer> predicate2 = i -> i > 0;
        Predicate<Integer> predicate3 = predicate1.and(predicate2);
        return check(predicate3, num);
    }
    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
