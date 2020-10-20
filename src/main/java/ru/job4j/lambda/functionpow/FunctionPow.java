package ru.job4j.lambda.functionpow;

import java.util.function.Function;

public class FunctionPow {
    public static double calculate(double x) {
        Function<Double, Double> pow = n -> Math.pow(n, 2);
        return calculate(pow, x);
    }
    public static double calculate(Function<Double, Double > y, double x) {
        return y.apply(x);

    }
}
