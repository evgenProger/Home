package ru.job4j.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleMatrixTest {
    @Test
    public void whenRows3() {
        int[][] res = {
                {1}, {2, 3}, {4, 5, 6}
        };
        assertArrayEquals(res, TriangleMatrix.rows(3));
    }

}