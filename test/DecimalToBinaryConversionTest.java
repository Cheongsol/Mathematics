package test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import Calculus.Calculus;
import Calculus.DecimalToBinaryConversion;

class DecimalToBinaryConversionTest {
	private Calculus testItem;
	
	@Before
	public void setUp() {
		System.out.println("testing Start");
		testItem = new DecimalToBinaryConversion();
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("testing end");
		testItem = null;
	}
	
	/*
	 * Test Type : Black Box Testing (Equivalence Partitioning)
	 * Purpose : Validate Right Range
	 * input : decimal = 23
	 * Expected : decimalToBinary(decimal) = 10111
	 */
	@Test
	void testdecimalToBinary() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		testItem = new DecimalToBinaryConversion();
		ArrayList<Integer> actual = new ArrayList<Integer>();
		actual.add(1);
		actual.add(0);
		actual.add(1);
		actual.add(1);
		actual.add(1);
		int decimal = 23;
		Method method = testItem.getClass().getDeclaredMethod("decimalToBinary",int.class);
		method.setAccessible(true);
		@SuppressWarnings("unchecked")
		ArrayList<Integer> result = (ArrayList<Integer>) method.invoke(testItem, decimal);
		assertEquals(result, actual);
	}
	
	/*
	 * Test Type : Black Box Testing (Equivalence Partitioning)
	 * Purpose : Confirmation for the value of zero
	 * input : decimal = 0
	 * Expected : decimalToBinary(decimal) is Empty
	 */
	@Test
	void testzerodecimalToBinary() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		testItem = new DecimalToBinaryConversion();
		int decimal = 0;
		Method method = testItem.getClass().getDeclaredMethod("decimalToBinary",int.class);
		method.setAccessible(true);
		@SuppressWarnings("unchecked")
		ArrayList<Integer> result = (ArrayList<Integer>) method.invoke(testItem, decimal);
		assertTrue(result.isEmpty());
	}
	
	/*
	 * Test Type : Black Box Testing (Equivalence Partitioning)
	 * Purpose : Confirmation of negative values
	 * input : decimal = -32
	 * Expected : decimalToBinary(decimal) is Empty
	 */
	@Test
	void testminusdecimalToBinary() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		testItem = new DecimalToBinaryConversion();
		int decimal = -32;
		Method method = testItem.getClass().getDeclaredMethod("decimalToBinary",int.class);
		method.setAccessible(true);
		@SuppressWarnings("unchecked")
		ArrayList<Integer> result = (ArrayList<Integer>) method.invoke(testItem, decimal);
		assertTrue(result.isEmpty());
	}
	
	/*
	 * Test Type : White Box Testing (Statement Coverage)
	 * Purpose : Check execution for correct format
	 * input : binary = 101
	 * Expected : Print "101"
	 */
	@Test
	void printBinaryTest() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new DecimalToBinaryConversion();
		ArrayList<Integer> binary = new ArrayList<>();
		binary.add(1);
		binary.add(0);
		binary.add(1);
		Method method=testItem.getClass().getDeclaredMethod("printBinary",ArrayList.class);
		method.setAccessible(true);
		method.invoke(testItem, binary);
	}
	
	/*
	 * Test Type : Black Box Testing
	 * Purpose : Ensure calculus operation
	 * Input : Nothing
	 * Expected : Print "Please input a decimal number to convert..."
	 * 			  Input numToConvert
	 * 			  Execute decimalToBinary(numToConvert)
	 * 			  Print "Decimal number: "+numToConvert + " is equal to binary number: "
	 * 			  Execute printBinary(convertedNum)
	 */
	@Test
	void calculusTest() {
		testItem = new DecimalToBinaryConversion();
		testItem.calculus();
	}
	
	/*
	 * Test Type : Black Box Testing
	 * Purpose : Ensure error operation
	 * Input : Nothing
	 * Expected : Print "Please provide only numbers (no text). Restart the program and try again!"
	 */
	@Test
	void errorTest() {
		testItem = new DecimalToBinaryConversion();
		testItem.error();
	}

}
