/**
 * Created by Ploy on 13/3/2560.
 */
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class CurrencyTest {
    @Test
    public void testCalculator(){
        GradeCalculator gc = new GradeCalculator();
	assertThat(gc.calculate(25,28,32),is('B'));
    }
}
