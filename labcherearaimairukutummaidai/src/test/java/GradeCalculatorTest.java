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
        assertThat(gc.calculate(40, 26),is('D'));
        assertThat(gc.calculate(20,12,6),is('F'));
        assertThat(gc.calculate(80,35,5),is('X'));
        assertThat(gc.calculate(80),is('B'));
    }
}
