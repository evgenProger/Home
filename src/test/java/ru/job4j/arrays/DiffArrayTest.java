package ru.job4j.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiffArrayTest {
    @Test
    public void test() {
        assertArrayEquals(new int[] {}, DiffArray.diff(new int[] {}, new int[] {}));
        assertArrayEquals(new int[] {1}, DiffArray.diff(new int[] {1}, new int[] {}));
        assertArrayEquals(new int[] {}, DiffArray.diff(new int[] {}, new int[] {1}));
        assertArrayEquals(new int[] {1}, DiffArray.diff(new int[] {1}, new int[] {}));
        assertArrayEquals(new int[] {1, 3}, DiffArray.diff(new int[] {1, 2, 3}, new int[] {2}));
        assertArrayEquals(new int[] {4, 3}, DiffArray.diff(new int[] {4, 3}, new int[] {2}));
        assertArrayEquals(new int[] {1, 5}, DiffArray.diff(new int[] {1, 3, 4, 5}, new int[] {2, 3, 4}));
        
    }
}

