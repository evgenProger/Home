import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccuracyTest {
    @Test
    public  void whenThreeNumberDoubleThenZero() {
        Accuracy accuracy = new Accuracy();
        boolean result =   accuracy.doubleExpression(0.1, 0.2, 0.3);
        assertThat(result, is(true));
    }

}