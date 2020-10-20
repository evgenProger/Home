package ru.job4j.lambda;

import java.util.function.Function;

public class FunctionFormula {
    public static double calculate(double x) {
        Function<Double, Double> num = n -> n * n + 2 * n + 1;
        return calculate(num, x);

    }
    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
