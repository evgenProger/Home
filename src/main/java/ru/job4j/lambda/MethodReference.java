package ru.job4j.lambda;

import java.util.function.Consumer;

public class MethodReference {
    public void applyByInstance() {
        MethodReference methodReference = new MethodReference();
        Consumer<String> consumer = i -> methodReference.consumerByInstance(i);
        consumer.accept("Hello");
    }
    public static void applyByClass() {
        Consumer<String> consumer = i -> MethodReference.consumerByClass(i);
        consumer.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
        
    }


}
