package my;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		Testing test=new Testing();
		int out=test.square(5);
		assertEquals(25,out);
	}

}
