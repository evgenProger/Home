package ru.job4j.lambda;

import java.util.function.Function;

public class FunctionSqrt {
    public static double calculate(double x) {
        Function<Double, Double> sqrt = Math::sqrt;
        return calculate(sqrt, x);

    }
    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
