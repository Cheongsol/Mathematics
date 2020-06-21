package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import Calculus.BinaryToHexadecimalConversion;
import Calculus.Calculus;

class BinaryToHexadecimalConversionTest {
	private Calculus testItem;
	
	@Before
	public void setUp() {
		testItem = new BinaryToHexadecimalConversion();
	}

	@After
	public void tearDown() throws Exception {testItem = null;}
	
	/*
	 * Test Type : Black Box Testing (Cause Effect Graph)
	 * Purpose : Check execution for correct format
	 * input : binary = "1010"
	 * Expected : true
	 */
	@Test
	void testTruebinaryIsValid() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String binary = "1010";
		Method method=testItem.getClass().getDeclaredMethod("binaryIsValid",String.class);
		method.setAccessible(true);
		boolean result = (boolean)method.invoke(testItem, binary);
		assertTrue(result);
	}
	
	/*
	 * Test Type : Black Box Testing (Cause Effect Graph)
	 * Purpose : Error checking for incorrect type input
	 * input : binary = "2010"
	 * Expected : true
	 */
	@Test
	void testFalsebinaryIsValid() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String binary = "2010";
		Method method = testItem.getClass().getDeclaredMethod("binaryIsValid",String.class);
		method.setAccessible(true);
		boolean result = (boolean)method.invoke(testItem, binary);
		assertFalse(result);
	}
	
	/*
	 * Test Type : Black Box Testing (Pairwise)
	 * Purpose : inspection of input division of corresponding function
	 * input : binary = {"0", "00", "000", "0000"}
	 * Expected : 0
	 */
	@Test
	void testzerobinToHex() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String[] binary = {"0", "00", "000", "0000"};
		String[] actual = {"0", "0", "0", "0"};
		Method method = testItem.getClass().getDeclaredMethod("binToHex", String.class);
		method.setAccessible(true);
		String[] result = new String[binary.length];
		for(int i=0; i<binary.length; ++i) {
			result[i] = (String)method.invoke(testItem, binary[i]);
		}
		assertTrue(Arrays.equals(result, actual));
	}
	
	/*
	 * Test Type : Black Box Testing (Pairwise)
	 * Purpose : inspection of input division of corresponding function
	 * input : binary = {"1", "01", "001", "0001"}
	 * Expected : 1
	 */
	@Test
	void testonebinToHex() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String[] binary = {"1", "01", "001", "0001"};
		String[] actual = {"1", "1", "1", "1"};
		Method method = testItem.getClass().getDeclaredMethod("binToHex", String.class);
		method.setAccessible(true);
		String[] result = new String[binary.length];
		for(int i=0; i<binary.length; ++i) {
			result[i] = (String)method.invoke(testItem, binary[i]);
		}
		assertTrue(Arrays.equals(result, actual));
	}
	
	/*
	 * Test Type : Black Box Testing (Pairwise)
	 * Purpose : inspection of input division of corresponding function
	 * input : binary = {"10", "010", "0010"}
	 * Expected : 2
	 */
	@Test
	void testtwobinToHex() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String[] binary = {"10", "010", "0010"};
		String[] actual = {"2", "2", "2"};
		Method method = testItem.getClass().getDeclaredMethod("binToHex", String.class);
		method.setAccessible(true);
		String[] result = new String[binary.length];
		for(int i=0; i<binary.length; ++i) {
			result[i] = (String)method.invoke(testItem, binary[i]);
		}
		assertTrue(Arrays.equals(result, actual));
	}
	
	/*
	 * Test Type : Black Box Testing (Pairwise)
	 * Purpose : inspection of input division of corresponding function
	 * input : binary = {"11", "011", "0011"}
	 * Expected : 3
	 */
	@Test
	void testthreebinToHex() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String[] binary = {"11", "011", "0011"};
		String[] actual = {"3", "3", "3"};
		Method method = testItem.getClass().getDeclaredMethod("binToHex", String.class);
		method.setAccessible(true);
		String[] result = new String[binary.length];
		for(int i=0; i<binary.length; ++i) {
			result[i] = (String)method.invoke(testItem, binary[i]);
		}
		assertTrue(Arrays.equals(result, actual));
	}
	
	/*
	 * Test Type : Black Box Testing (Pairwise)
	 * Purpose : inspection of input division of corresponding function
	 * input : binary = {"100", "0100"}
	 * Expected : 4
	 */
	@Test
	void testfourbinToHex() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String[] binary = {"100", "0100"};
		String[] actual = {"4", "4"};
		Method method = testItem.getClass().getDeclaredMethod("binToHex", String.class);
		method.setAccessible(true);
		String[] result = new String[binary.length];
		for(int i=0; i<binary.length; ++i) {
			result[i] = (String)method.invoke(testItem, binary[i]);
		}
		assertTrue(Arrays.equals(result, actual));
	}
	
	/*
	 * Test Type : Black Box Testing (Pairwise)
	 * Purpose : inspection of input division of corresponding function
	 * input : binary = {"101", "0101"}
	 * Expected : 5
	 */
	@Test
	void testfivebinToHex() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String[] binary = {"101", "0101"};
		String[] actual = {"5", "5"};
		Method method = testItem.getClass().getDeclaredMethod("binToHex", String.class);
		method.setAccessible(true);
		String[] result = new String[binary.length];
		for(int i=0; i<binary.length; ++i) {
			result[i] = (String)method.invoke(testItem, binary[i]);
		}
		assertTrue(Arrays.equals(result, actual));
	}
	
	/*
	 * Test Type : Black Box Testing (Pairwise)
	 * Purpose : inspection of input division of corresponding function
	 * input : binary = {"110", "0110"}
	 * Expected : 6
	 */
	@Test
	void testsixbinToHex() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String[] binary = {"110", "0110"};
		String[] actual = {"6", "6"};
		Method method = testItem.getClass().getDeclaredMethod("binToHex", String.class);
		method.setAccessible(true);
		String[] result = new String[binary.length];
		for(int i=0; i<binary.length; ++i) {
			result[i] = (String)method.invoke(testItem, binary[i]);
		}
		assertTrue(Arrays.equals(result, actual));
	}
	
	/*
	 * Test Type : Black Box Testing (Pairwise)
	 * Purpose : inspection of input division of corresponding function
	 * input : binary = {"111", "0111"}
	 * Expected : 7
	 */
	@Test
	void testsevenbinToHex() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String[] binary = {"111", "0111"};
		String[] actual = {"7", "7"};
		Method method = testItem.getClass().getDeclaredMethod("binToHex", String.class);
		method.setAccessible(true);
		String[] result = new String[binary.length];
		for(int i=0; i<binary.length; ++i) {
			result[i] = (String)method.invoke(testItem, binary[i]);
		}
		assertTrue(Arrays.equals(result, actual));
	}
	
	/*
	 * Test Type : Black Box Testing (Pairwise)
	 * Purpose : inspection of input division of corresponding function
	 * input : binary = "1000"
	 * Expected : 8
	 */
	@Test
	void testeightbinToHex() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String[] binary = {"1000"};
		String[] actual = {"8"};
		Method method = testItem.getClass().getDeclaredMethod("binToHex", String.class);
		method.setAccessible(true);
		String[] result = new String[binary.length];
		for(int i=0; i<binary.length; ++i) {
			result[i] = (String)method.invoke(testItem, binary[i]);
		}
		assertTrue(Arrays.equals(result, actual));
	}
	
	/*
	 * Test Type : Black Box Testing (Pairwise)
	 * Purpose : inspection of input division of corresponding function
	 * input : binary = "1001"
	 * Expected : 9
	 */
	@Test
	void testninebinToHex() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String[] binary = {"1001"};
		String[] actual = {"9"};
		Method method = testItem.getClass().getDeclaredMethod("binToHex", String.class);
		method.setAccessible(true);
		String[] result = new String[binary.length];
		for(int i=0; i<binary.length; ++i) {
			result[i] = (String)method.invoke(testItem, binary[i]);
		}
		assertTrue(Arrays.equals(result, actual));
	}
	
	/*
	 * Test Type : Black Box Testing (Pairwise)
	 * Purpose : inspection of input division of corresponding function
	 * input : binary = "1010"
	 * Expected : A
	 */
	@Test
	void testAbinToHex() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String[] binary = {"1010"};
		String[] actual = {"A"};
		Method method = testItem.getClass().getDeclaredMethod("binToHex", String.class);
		method.setAccessible(true);
		String[] result = new String[binary.length];
		for(int i=0; i<binary.length; ++i) {
			result[i] = (String)method.invoke(testItem, binary[i]);
		}
		assertTrue(Arrays.equals(result, actual));
	}
	
	/*
	 * Test Type : Black Box Testing (Pairwise)
	 * Purpose : inspection of input division of corresponding function
	 * input : binary = "1011"
	 * Expected : B
	 */
	@Test
	void testBbinToHex() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String[] binary = {"1011"};
		String[] actual = {"B"};
		Method method = testItem.getClass().getDeclaredMethod("binToHex", String.class);
		method.setAccessible(true);
		String[] result = new String[binary.length];
		for(int i=0; i<binary.length; ++i) {
			result[i] = (String)method.invoke(testItem, binary[i]);
		}
		assertTrue(Arrays.equals(result, actual));
	}
	
	/*
	 * Test Type : Black Box Testing (Pairwise)
	 * Purpose : inspection of input division of corresponding function
	 * input : binary = "1100"
	 * Expected : C
	 */
	@Test
	void testCbinToHex() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String[] binary = {"1100"};
		String[] actual = {"C"};
		Method method = testItem.getClass().getDeclaredMethod("binToHex", String.class);
		method.setAccessible(true);
		String[] result = new String[binary.length];
		for(int i=0; i<binary.length; ++i) {
			result[i] = (String)method.invoke(testItem, binary[i]);
		}
		assertTrue(Arrays.equals(result, actual));
	}
	
	/*
	 * Test Type : Black Box Testing (Pairwise)
	 * Purpose : inspection of input division of corresponding function
	 * input : binary = "1101"
	 * Expected : D
	 */
	@Test
	void testDbinToHex() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String[] binary = {"1101"};
		String[] actual = {"D"};
		Method method = testItem.getClass().getDeclaredMethod("binToHex", String.class);
		method.setAccessible(true);
		String[] result = new String[binary.length];
		for(int i=0; i<binary.length; ++i) {
			result[i] = (String)method.invoke(testItem, binary[i]);
		}
		assertTrue(Arrays.equals(result, actual));
	}
	
	/*
	 * Test Type : Black Box Testing (Pairwise)
	 * Purpose : inspection of input division of corresponding function
	 * input : binary = "1110"
	 * Expected : E
	 */
	@Test
	void testEbinToHex() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String[] binary = {"1110"};
		String[] actual = {"E"};
		Method method = testItem.getClass().getDeclaredMethod("binToHex", String.class);
		method.setAccessible(true);
		String[] result = new String[binary.length];
		for(int i=0; i<binary.length; ++i) {
			result[i] = (String)method.invoke(testItem, binary[i]);
		}
		assertTrue(Arrays.equals(result, actual));
	}
	
	/*
	 * Test Type : Black Box Testing (Pairwise)
	 * Purpose : inspection of input division of corresponding function
	 * input : binary = "1111"
	 * Expected : F
	 */
	@Test
	void testFbinToHex() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new BinaryToHexadecimalConversion();
		String[] binary = {"1111"};
		String[] actual = {"F"};
		Method method = testItem.getClass().getDeclaredMethod("binToHex", String.class);
		method.setAccessible(true);
		String[] result = new String[binary.length];
		for(int i=0; i<binary.length; ++i) {
			result[i] = (String)method.invoke(testItem, binary[i]);
		}
		assertTrue(Arrays.equals(result, actual));
	}
	
	/*
	 * Test Type : Black Box Testing (Boundary Value Analysis)
	 * Purpose : inspection of input division of corresponding function
	 * input : binaryNumber = "1010" (binaryNumber.length = 4)
	 * Expected : Not execute divideByFourBits
	 */
	@Test 
	void testbinaryToHexadecimalConversion() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		testItem = new BinaryToHexadecimalConversion();
		String binaryNumber = "1010";
		Method method = testItem.getClass().getDeclaredMethod("binaryToHexadecimalConversion", String.class);
		method.setAccessible(true);
		method.invoke(testItem, binaryNumber);
	}
	
	/*
	 * Test Type : Black Box Testing (Boundary Value Analysis)
	 * Purpose : inspection of input division of corresponding function
	 * input : binaryNumber = "111" (binaryNumber.length = 3)
	 * Expected : Not execute divideByFourBits
	 */
	@Test 
	void testunderFourbinaryToHexadecimalConversion() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		testItem = new BinaryToHexadecimalConversion();
		String binaryNumber = "111";
		Method method = testItem.getClass().getDeclaredMethod("binaryToHexadecimalConversion", String.class);
		method.setAccessible(true);
		method.invoke(testItem, binaryNumber);
	}
	
	/*
	 * Test Type : Black Box Testing (Boundary Value Analysis)
	 * Purpose : inspection of input division of corresponding function
	 * input : binaryNumber = "10101" (binaryNumber.length = 5)
	 * Expected : Execute divideByFourBits
	 */
	@Test 
	void testoverfourbinaryToHexadecimalConversion() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		testItem = new BinaryToHexadecimalConversion();
		String binaryNumber = "10101";
		Method method = testItem.getClass().getDeclaredMethod("binaryToHexadecimalConversion", String.class);
		method.setAccessible(true);
		method.invoke(testItem, binaryNumber);
	}
	
	/*
	 * Test Type : Black Box Testing
	 * Purpose : Ensure calculus operation
	 * Input : Nothing
	 * Expected : Print "Please input a binary number to convert: "
	 * 			  Input binaryNumber
	 * 			  Execute binaryToHexadecimalConversion(binaryNumber)
	 */
	@Test
	void testCorrectBinary() {
		testItem = new BinaryToHexadecimalConversion();
		String binary = "1010";
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
		testItem = new BinaryToHexadecimalConversion();
		testItem.error();
	}
}
