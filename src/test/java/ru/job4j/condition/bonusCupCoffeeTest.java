package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class bonusCupCoffeeTest {
    @Test
    public void countCup() {
        int rs1 = BonusCupCoffee.countCup(7, 6);
        assertThat(rs1, is(8));
    }

}