package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class SymmetryTest {
    @Test
    public void checkTrue() {
        boolean rs1 = Symmetry.check(1112111);
        assertTrue(rs1);

    }


}