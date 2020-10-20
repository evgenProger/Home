package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitSumTest {
    @Test
    public void test() {
        assertEquals(6, DigitSum.sum(123));
        assertEquals(1, DigitSum.sum(1));
    }

}