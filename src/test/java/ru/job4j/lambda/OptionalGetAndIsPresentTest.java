package ru.job4j.lambda;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class OptionalGetAndIsPresentTest {
    @Test
    public void whenExist() {
        assertEquals(
                1,
                 OptionalGetAndIsPresent.get(new int[] {1, 2, 3}, 2)
        );
    }

}