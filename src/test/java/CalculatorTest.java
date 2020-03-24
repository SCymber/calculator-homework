import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

            @Before
            public void calculator(){
                calculator = new Calculator();
            }

    @Test
    public void calcAdd(){
        assertEquals(7, calculator.add(3, 4));
    }

    @Test
    public void calcSubtract(){
        assertEquals(3, calculator.subtract(8, 5));
    }

    @Test
    public void calcMultiply(){
        assertEquals(9, calculator.multiply(3, 3));
    }

    @Test
    public void calcDivide(){
        assertEquals(3, calculator.divide(9, 3));
    }
}
