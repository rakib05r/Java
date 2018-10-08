package my;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorJUnitTest1 {

	@Test
    public void testMultiply() {
            Calculator calc = new Calculator();
            assertEquals(125, calc.multiply(5,5,5));
    }

}

