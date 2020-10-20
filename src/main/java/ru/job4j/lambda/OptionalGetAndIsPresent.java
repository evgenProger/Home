package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class OptionalGetAndIsPresent {
    public static int get(int[] data, int e1) {
        if(indexOf(data, e1).isEmpty()) {
            return -1;
        }
        else {
            return indexOf(data, e1).get();
        }
    }
    private static Optional<Integer> indexOf(int[] data, int e1) {
            for (int i = 0; i < data.length; i++) {
            if(data[i] == e1) {
                return Optional.of(i);

            }
        }
            return Optional.empty();
    }
}
