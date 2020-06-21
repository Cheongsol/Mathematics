package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import Calculus.BinaryToDecimalConversion;
import Calculus.Calculus;

class BinaryToDecimalConversionTest {
	private Calculus testItem;
	@Before
	public void setUp() {
		System.out.print("Test starting");
		testItem = new BinaryToDecimalConversion();
	}
	@After
	public void tearDown() throws Exception {
		System.out.print("Test end");
		testItem = null;
	}
	
	/*
	 * Test type : Black Box Test(Equivalence Partitioning)
	 * Purpose : Check execution for correct format
	 * input : binary = "1010"
	 * Expected : True
	 */
	@Test 
	void testTruebinaryIsValid() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToDecimalConversion();
		String binary = "1010";
		Method method=testItem.getClass().getDeclaredMethod("binaryIsValid",String.class);
		method.setAccessible(true);
		boolean result = (boolean)method.invoke(testItem, binary);
		assertTrue(result);
	}
	
	/*
	 * Test type : Black Box Test(Equivalence Partitioning)
	 * Purpose : Check execution for incorrect format
	 * input : binary = "2010"
	 * Expected : False
	 */
	@Test
	void testFalsebinaryIsValid() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToDecimalConversion();
		String binary = "2010";
		Method method = testItem.getClass().getDeclaredMethod("binaryIsValid",String.class);
		method.setAccessible(true);
		boolean result = (boolean)method.invoke(testItem, binary);
		assertFalse(result);
	}
	
	/*
	 * Test type : Black Box Test(Equivalence Partitioning)
	 * Purpose : Check execution for positive numbers
	 * input : 1010 (binary > 0)
	 * Expected : 10
	 */
	@Test
	void testbinaryToDecimalConversion() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		testItem = new BinaryToDecimalConversion();
		Method method;
		int binary = 1010;
		int actual = 10;
		method = testItem.getClass().getDeclaredMethod("binaryToDecimalConversion",int.class);
		method.setAccessible(true);
		int result = (int)method.invoke(testItem, binary);
		assertEquals(actual, result);
	}
	
	/*
	 * Test type : Black Box Test(Equivalence Partitioning)
	 * Purpose : Check execution for zero
	 * input : binary = 0
	 * Expected : 0
	 */
	@Test
	void testzerobinaryToDecimalConversion() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		testItem = new BinaryToDecimalConversion();
		Method method;
		int binary = 0;
		int actual = 0;
		method = testItem.getClass().getDeclaredMethod("binaryToDecimalConversion",int.class);
		method.setAccessible(true);
		int result = (int)method.invoke(testItem, binary);
		assertEquals(actual, result);
	}
	
	/*
	 * Test type : Black Box Test(Equivalence Partitioning)
	 * Purpose : Check execution for negative numbers
	 * input : -1010(binary < 0)
	 * Expected : 0
	 */
	@Test
	void testminusbinaryToDecimalConversion() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		testItem = new BinaryToDecimalConversion();
		Method method;
		int binary = -1010;
		int actual = 0;
		method = testItem.getClass().getDeclaredMethod("binaryToDecimalConversion",int.class);
		method.setAccessible(true);
		int result = (int)method.invoke(testItem, binary);
		assertEquals(actual, result);
	}
	
	/*
	 * Test Type : Black Box Testing
	 * Purpose : Ensure calculus operation
	 * Input : Nothing
	 * Expected : Print "Please input a binary number to convert..."
	 * 			  Input binary
	 * 			  Execute binaryIsValid(binary)
	 * 				if true
	 * 				Execute binaryToDecimalConversion(numToConvert)
	 * 			  Print "Binary number: "+binary + " is equal to decimal number: "+ convertedNum
	 */
	@Test
	void testCalculus() {
		testItem = new BinaryToDecimalConversion();
		testItem.calculus();
	}
	
	/*
	 * Test Type : Black Box Testing
	 * Purpose : Ensure error operation
	 * Input : Nothing
	 * Expected : Print "Please provide only numbers (no text). Restart the program and try again!"
	 */
	@Test
	void testError() {
		testItem = new BinaryToDecimalConversion();
		testItem.error();
	}
}
