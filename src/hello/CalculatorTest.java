package hello;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private static Calculator calculator = new Calculator();
	
	public CalculatorTest() {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
		
		calculator.clear();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@Test
	public void testAdd() {
//		fail("Not yet implemented");
		
		calculator.add(2);
        calculator.add(3);

        assertEquals(5, calculator.getResult());
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

}
