import static org.junit.Assert.*;

 
import java.util.InputMismatchException;
import org.junit.Test;


public class fibonacciTest {
	/**
	 * Purpose : test isFibonacci()
	 * Input : 5, 10
	 * Expected :
	 * 		input = 5  -> result = true
	 * 		input = 10 -> result = false
	 */

	@Test
	public void testIsFibonacci() {
		assertEquals(true, fibonacci.isFibonacci(5));
		assertEquals(false, fibonacci.isFibonacci(10));
	}
	
	/**
	 * Purpose : test getRoot2()
	 * Input : 3, 1
	 * Expected :
	 * 		input = 3  -> result = 7.0
	 * 		input = 1  -> result = 3.0
	 */

	@Test
	public void testGetRoot2() {
		assertEquals(7.0, fibonacci.getRoot2(3),0);
		assertEquals(3.0, fibonacci.getRoot2(1),0);
	}
	
	/**
	 * Purpose : test getRoot1()
	 * Input : 1, 2
	 * Expected :
	 * 		input = 1  -> result = 1.0
	 * 		input = 2  -> result = 4.0
	 */

	@Test
	public void testGetRoot1() {
		assertEquals(1.0, fibonacci.getRoot1(1),0);
		assertEquals(4.0, fibonacci.getRoot1(2),0);
	}
	
	/**
	 * Purpose : test checkNumber() for invalid value
	 * Input : -1
	 * Expected :
	 * 		throw InputMismatchException.class
	 */
	@Test(expected = InputMismatchException.class)
	public void testCheckNumber() {
		fibonacci.checkNumber(-1);
	}
	

}
