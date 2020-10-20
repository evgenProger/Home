package ru.job4j.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckSquareArrayTest {
    @Test
    public void checkArrayTrue() {
        int[][] in = new int[][]{{4, 5, 6}, {2, 3, 0}, {1, 7, 8}};
        assertTrue(CheckSquareArray.checkArray(in));
    }


}