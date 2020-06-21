import static org.junit.Assert.*;

import java.util.InputMismatchException;
import org.junit.Test;

 
public class FactorialTest {
	
	/**
	 * Purpose : test getFactorial() for number less than 2
	 * Input : 1, 0
	 * Expected :
	 * 		input = 1 -> result = 1
	 * 		input = 0 -> result = 1
	 */

	@Test
	public void testGetFactorialLessThan2() {
		assertEquals(1, Factorial.getFactorial(1));
		assertEquals(1, Factorial.getFactorial(0));
	}
	
	/**
	 * Purpose : test getFactorial() for number equal or more than 2
	 * Input : 3, 2, 5
	 * Expected :
	 * 		input = 3 -> result = 6
	 * 		input = 2 -> result = 2
	 * 		input = 5 -> result = 120
	 */
	@Test
	public void testGetFactorial() {
		assertEquals(6, Factorial.getFactorial(3));
		assertEquals(2, Factorial.getFactorial(2));
		assertEquals(120, Factorial.getFactorial(5));
	}
	
	/**
	 * Purpose : test checkNumber() for invalid value
	 * Input : -1
	 * Expected :
	 * 		throw InputMismatchException.class
	 */
	@Test(expected = InputMismatchException.class)
	public void testCheckNumber() {
		Factorial.checkNumber(-1);
	}

	/**
	 * Purpose : test inputError()
	 * Input : none
	 * Expected :
	 * 		throw InputMismatchException.class
	 */
	@Test(expected = InputMismatchException.class)
	public void testInputError() {
		Factorial.inputError();
	}


}