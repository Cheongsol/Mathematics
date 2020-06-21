package test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import Calculus.Calculus;
import Calculus.Gamma;

class GammaTest {
	private Calculus testItem;
	
	@BeforeClass
	public void setUp() {
		testItem = new Gamma();
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("testing end");
		testItem = null;
	}
	
	/*
	 * Test Type : Black Box Testing (Decision Table Testing)
	 * Purpose : Check the logGamma function's boundary value 
	 * Input : x = 12.0
	 * Expected : logGamma(12.0) is 17.50230784565941
	 */
	@Test
	void testlogGamma() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		testItem = new Gamma();
		double x = 12.0;
		double actual = 17.50230784565941;
		Method method = testItem.getClass().getDeclaredMethod("logGamma",double.class);
		method.setAccessible(true);
		double result = (double) method.invoke(testItem, x);
		assertEquals(result, actual);
	}
	
	/*
	 * Test Type : Black Box Testing (Decision Table Testing)
	 * Purpose : Check the logGamma function's boundary value 
	 * Input : x = 0.0
	 * Expected : logGamma(x) is Infinite
	 */
	@Test
	void testzerologGamma() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new Gamma();
		double x = 0.0;
		Method method = testItem.getClass().getDeclaredMethod("logGamma",double.class);
		method.setAccessible(true);
		double result = (double) method.invoke(testItem, x);
		assertTrue(Double.isInfinite(result));
	}
	
	/*
	 * Test Type : Black Box Testing (Decision Table Testing)
	 * Purpose : Check the logGamma function's boundary value 
	 * Input : x = -12.0
	 * Expected : logGamma(-12.0) is NaN
	 */
	@Test
	void testminuslogGamma() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new Gamma();
		double x = -12.0;
		Method method = testItem.getClass().getDeclaredMethod("logGamma",double.class);
		method.setAccessible(true);
		double result = (double) method.invoke(testItem, x);
		assertTrue(Double.isNaN(result));
	}
	
	/*
	 * Test Type : Black Box Testing (Decision Table Testing)
	 * Purpose : Check the gamma function's boundary value 
	 * Input : x = 12.0
	 * Expected : gamma(12.0) is 3.9916799991438776E7
	 */
	@Test
	void testGamma() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new Gamma();
		double x = 12.0;
		double actual = 3.9916799991438776E7;
		Method method = testItem.getClass().getDeclaredMethod("gamma",double.class);
		method.setAccessible(true);
		double result = (double) method.invoke(testItem, x);
		assertEquals(result, actual);
	}
	
	/*
	 * Test Type : Black Box Testing (Decision Table Testing)
	 * Purpose : Check the gamma function's boundary value 
	 * Input : x = 0.0
	 * Expected : gamma(0.0) is Infinity
	 */
	@Test
	void testzeroGamma() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new Gamma();
		double x = 0.0;
		Method method = testItem.getClass().getDeclaredMethod("gamma",double.class);
		method.setAccessible(true);
		double result = (double) method.invoke(testItem, x);
		assertTrue(Double.isInfinite(result));
	}
	
	/*
	 * Test Type : Black Box Testing (Decision Table Testing)
	 * Purpose : Check the gamma function's boundary value 
	 * Input : x = -12.0
	 * Expected : gamma(-12.0) is NaN
	 */
	@Test
	void testminusGamma() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new Gamma();
		double x = -12.0;
		Method method = testItem.getClass().getDeclaredMethod("gamma",double.class);
		method.setAccessible(true);
		double result = (double) method.invoke(testItem, x);
		assertTrue(Double.isNaN(result));
	}
	
	/*
	 * Test Type : White Box Testing
	 * Purpose : Ensure calculus operation
	 * Input : Nothing
	 * Expected : Print "Introduce a number: "
	 * 			  Input x
	 * 			  Print "Gamma(" + x + ") = " + gamma(x)
	 * 			  Print "log Gamma(" + x + ") = " + logGamma(x)
	 */
	@Test
	void calculusTest() {
		testItem = new Gamma();
		testItem.calculus();
	}
	
	/*
	 * Test Type : White Box Testing
	 * Purpose : Ensure error operation
	 * Input : Nothing
	 * Expected : Print "Please provide only numbers (no text). Restart the program and try again!"
	 */
	@Test
	void errorTest() {
		testItem = new Gamma();
		testItem.error();
	}
}
