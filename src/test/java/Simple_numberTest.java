import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;


public class Simple_numberTest {
    @Test
    public void when1() {
        boolean rs1 = Simple_number.check(1);
        assertThat(rs1, is(false));
    }
    @Test
    public void when4() {
        boolean rs1 = Simple_number.check(4);
        assertThat(rs1, is(false));
    }


}