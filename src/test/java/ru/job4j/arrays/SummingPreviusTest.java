package ru.job4j.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SummingPreviusTest {
    @Test
    public void test() {
        assertArrayEquals(new int[] {1, 2, 3}, SummingPrevius.calculate(1, 2, 3));
        assertArrayEquals(new int[] {1, 2, 3, 6}, SummingPrevius.calculate(1, 2, 4));
        assertArrayEquals(new int[] {1, 2, 3, 6, 12}, SummingPrevius.calculate(1, 2, 5));
    }

}