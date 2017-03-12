/**
 * Created by Ploy on 13/3/2560.
 */
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class GradeCalculatorTest {
    @Test
    public void testCalculator(){
        GradeCalculator gc = new GradeCalculator();
	    assertThat(gc.calculate(25,28,32),is('B'));
        assertThat(gc.calculate(0,7,32,5),is('F'));
        assertThat(gc.calculate(20,21,32,20),is('A'));
        assertThat(gc.calculate(100,28),is('x'));
    }
}
