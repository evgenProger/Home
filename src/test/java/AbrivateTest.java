import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class AbrivateTest {
    @Test
    public void whenGiveNameofTwoWordsThenConvertToInitials() {
        Abrivate fullname = new Abrivate();
        String result = fullname.initials("evgeny ivanov");
        assertThat(result, is("E.I"));

    }
}