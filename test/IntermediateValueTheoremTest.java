package test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import Calculus.Theorems.IntermediateValueTheorem;

class IntermediateValueTheoremTest {
	private IntermediateValueTheorem testItem;
	
	/*
	 * Test Type : White Box Testing
	 * Purpose : Ensure getMax operation
	 * Input : Nothing
	 * Expected : Get maximum value
	 */
	@Test
	void testgetMax() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new IntermediateValueTheorem();
		Method method = testItem.getClass().getDeclaredMethod("getMax");
		method.setAccessible(true);
		double result = (double) method.invoke(testItem);
		assertNotNull(result);
	}
	
	/*
	 * Test Type : White Box Testing
	 * Purpose : Ensure getMin operation
	 * Input : Nothing
	 * Expected : Get minimum value
	 */
	@Test
	void testgetMin() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new IntermediateValueTheorem();
		Method method = testItem.getClass().getDeclaredMethod("getMin");
		method.setAccessible(true);
		double result = (double) method.invoke(testItem);
		assertNotNull(result);
	}
	
	/*
	 * Test Type : White Box Testing
	 * Purpose : Ensure getValue operation
	 * Input : Nothing
	 * Expected : Get value wanted
	 */
	@Test
	void testgetValue() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new IntermediateValueTheorem();
		Method method = testItem.getClass().getDeclaredMethod("getValue");
		method.setAccessible(true);
		double result = (double) method.invoke(testItem);
		assertNotNull(result);
	}

	/*
	 * Test Type : Black Box Testing (Decision Table Testing)
	 * Purpose : Check Decision Table
	 * Input : yes
	 * Expected : Execute getMin
	 * 			  Execute getMax
	 * 		      Execute getValue
	 * 			  Print "Calculating..."
	 * 			  Execute getIsIntermediateValue
	 */
	@Test
	void testYesIntermediatedValueCalculator() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new IntermediateValueTheorem();
		String isContinuous = "yes";
		Method method = testItem.getClass().getDeclaredMethod("intermediatedValueCalculator", String.class);
		method.setAccessible(true);
		method.invoke(testItem, isContinuous);
	}
	
	/*
	 * Test Type : Black Box Testing (Decision Table Testing)
	 * Purpose : Check Decision Table
	 * Input : no
	 * Expected : Print "Since your function is not continuous, Intermediate Value Theorem does NOT apply..."
	 */
	@Test
	void testNoIntermediatedValueCalculator() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new IntermediateValueTheorem();
		String isContinuous = "no";
		Method method = testItem.getClass().getDeclaredMethod("intermediatedValueCalculator", String.class);
		method.setAccessible(true);
		method.invoke(testItem, isContinuous);
	}
	
	/*
	 * Test Type : Black Box Testing (Boundary Value Analysis)
	 * Purpose : Check the getIsIntermediateValue function's boundary value 
	 * Input : min=1, max=2, value=1.5
	 * Expected : Print "Yes! The function DOES pass through the given value based on the Intermediate Value Therorem!"
	 */
	@Test
	void testgetIsIntermediateValue() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new IntermediateValueTheorem();
		double min = 1;
		double max = 2;
		double value = 1.5;
		Method method = testItem.getClass().getDeclaredMethod("getIsIntermediateValue", double.class, double.class, double.class);
		method.setAccessible(true);
		method.invoke(testItem, min, max, value);
	}
	
	/*
	 * Test Type : Black Box Testing (Boundary Value Analysis)
	 * Purpose : Check the getIsIntermediateValue function's boundary value 
	 * Input : min=1, max=2, value=4
	 * Expected : Print "Sorry. The function may NOT pass through the value based on the Intermediate Value Theorem..."
	 */
	@Test
	void testFalsegetIsIntermediateValue() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new IntermediateValueTheorem();
		double min = 1;
		double max = 2;
		double value = 4;
		Method method = testItem.getClass().getDeclaredMethod("getIsIntermediateValue", double.class, double.class, double.class);
		method.setAccessible(true);
		method.invoke(testItem, min, max, value);
	}
	
	/*
	 * Test Type : Black Box Testing (Boundary Value Analysis)
	 * Purpose : Check the getIsIntermediateValue function's boundary value 
	 * Input : min=1, max=2, value=2
	 * Expected : Print "Sorry. The function may NOT pass through the value based on the Intermediate Value Theorem..."
	 */
	@Test
	void testEqualMaxgetIsIntermediateValue() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new IntermediateValueTheorem();
		double min = 1;
		double max = 2;
		double value = 2;
		Method method = testItem.getClass().getDeclaredMethod("getIsIntermediateValue", double.class, double.class, double.class);
		method.setAccessible(true);
		method.invoke(testItem, min, max, value);
	}
	
	/*
	 * Test Type : Black Box Testing (Boundary Value Analysis)
	 * Purpose : Check the getIsIntermediateValue function's boundary value 
	 * Input : min=1, max=2, value=1
	 * Expected : Print "Sorry. The function may NOT pass through the value based on the Intermediate Value Theorem..."
	 */
	@Test
	void testEqualMingetIsIntermediateValue() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new IntermediateValueTheorem();
		double min = 1;
		double max = 2;
		double value = 1;
		Method method = testItem.getClass().getDeclaredMethod("getIsIntermediateValue", double.class, double.class, double.class);
		method.setAccessible(true);
		method.invoke(testItem, min, max, value);
	}
}
