import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Test;

 
public class PowerOf2Test {
	
	/**
	 * Purpose : test isPower2() 
	 * Input : 0, 256, 10
	 * Expected :
	 * 		input = 0   -> result = -1
	 * 		input = 256 -> result =  8
	 * 		input = 10  -> result = -1
	 */
	@Test
	public void testIsPower2() {
		assertEquals(-1, PowerOf2.isPower2(0));
		assertEquals(8, PowerOf2.isPower2(256));
		assertEquals(-1,PowerOf2.isPower2(10));
	}
	
	/**
	 * Purpose : test getPower() 
	 * Input : 1, 512, 9
	 * Expected :
	 * 		input = 1   -> result =  0
	 * 		input = 512 -> result =  9
	 * 		input = 9   -> result = -1
	 */
	@Test
	public void testGetPower() {
		assertEquals(0, PowerOf2.getPower(1));
		assertEquals(9, PowerOf2.getPower(512));
		assertEquals(-1,PowerOf2.getPower(9));
	}
	
	/**
	 * Purpose : test lessThanMinimum() 
	 * Input : -1, 1, 3
	 * Expected :
	 * 		input = -1 -> result = true
	 * 		input = 1  -> result = false
	 * 		input = 3  -> result = false
	 */
	@Test
	public void testLessThanMinimum() {
		assertTrue(PowerOf2.lessThanMinimum(-1));
		assertFalse(PowerOf2.lessThanMinimum(1));
		assertFalse(PowerOf2.lessThanMinimum(3));
	}
	
	/**
	 * Purpose : test isOddNumber() 
	 * Input : 1, 8
	 * Expected :
	 * 		input = 1  -> result = true
	 * 		input = 8  -> result = false
	 */
	@Test
	public void testIsOddNumber() {
		assertTrue(PowerOf2.isOddNumber(1));
		assertFalse(PowerOf2.isOddNumber(8));
	}
	
	/**
	 * Purpose : test checkNumber() for invalid value
	 * Input : -1
	 * Expected :
	 * 		throw InputMismatchException.class
	 */
	@Test(expected = InputMismatchException.class)
	public void testCheckNumber() {
		PowerOf2.checkNumber(-1);
	}
	
	
	
}
