/**
 * Created by CAMT on 6/3/2560.
 */
pagkage utility;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
public class CurrencyTest {
    public void testExchange(){
        Currency currency = new Currency();
       assertThat(currency.exchange("USD",1.0,"USD"),closeTo(1.0,0.001));
    }
}