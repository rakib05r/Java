package my;



import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTesting {

	
	@Test
    public void testMultiply() {
            Calculator calc = new Calculator();
            assertEquals(125, calc.multiply(5,5,5));
    }


	@Test
	
    public void testAdd() {
            Calculator calc = new Calculator();
            assertEquals(60, calc.add(10,20,30));
    }
	
	
	
	/*@Test
	public void test() {
		fail("Not yet implemented");
	}
*/
}

