import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class CashMashineTest {
    @Test
    public void unchange() {
        CashMashine machine = new CashMashine(new int[] {1, 5, 10});
        int[] result = machine.exchange(1);
        assertThat(result, is(singletonList(singletonList(1))));
    }

    @Test
    public void five() {
        CashMashine machine = new CashMashine(new int[] {1, 5, 10});
        int[] result = machine.exchange(5);
        assertThat(result, is(
                asList(
                        asList(1, 1, 1, 1, 1),
                        asList(5)
                )
        ));
    }

    @Test
    public void change() {
        CashMashine machine = new CashMashine(new int[] {10, 5, 1});
        int[] result = machine.exchange(10);
        assertThat(
                result, is(
                        asList(
                                singletonList(10),
                                asList(5, 5),
                                asList(1, 1, 1, 1, 1, 5),
                                asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
                        )
                )
        );
    }
}

