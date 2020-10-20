package ru.job4j.lambda;

import java.util.function.Supplier;

public class MRSupplier {
    public static Supplier supplier() {
        Supplier<String> stringSupplier = String::new;
        return stringSupplier;
    }

}
