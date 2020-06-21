package test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import Calculus.Limits.LimitOfAPolynomial;

class LimitOfAPolynomialTest {
	private LimitOfAPolynomial testItem;
	@Before
	public void setUp() {
		System.out.print("Test starting");
		testItem = new LimitOfAPolynomial();
	}
	@After
	public void tearDown() throws Exception {
		System.out.print("Test end");
		testItem = null;
	}
	
	/*
	 * Test Type : Black Box Testing
	 * Purpose : Ensure error operation
	 * Input : Nothing
	 * Expected : Print "Please use the proper format... Try again!"
	 * 			  Restart
	 */
	@Test
	void testformatError() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new LimitOfAPolynomial();
		Method method;
		method = testItem.getClass().getDeclaredMethod("formatError");
		method.setAccessible(true);
		method.invoke(testItem);
	}
	
	/*
	 * Test Type : Black Box Testing
	 * Purpose : Ensure calculus operation
	 * input : input = "1,1,1,1"
	 * expected : execute getLimitApproachesNumber(1, 1, 1, 1)
	 * 			  Print "The limit is : (getLimitApproachesNumber(1, 1, 1, 1))"
	 */
	@Test
	void testLimitAtPoint() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new LimitOfAPolynomial();
		Method method;
		String input = "1,1,1,1";
		method = testItem.getClass().getDeclaredMethod("LimitAtPoint", String.class);
		method.setAccessible(true);
		method.invoke(testItem, input);
	}
	
	/*
	 * Test Type : Black Box Testing
	 * Purpose : Ensure calculus operation 
	 * input : input = "1,1,1"
	 * expected : execute getLimit(1, 1, 1)
	 */
	@Test
	void testLimitAtInfinity() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new LimitOfAPolynomial();
		Method method;
		String input = "1,1,1";
		method = testItem.getClass().getDeclaredMethod("LimitAtInfinity", String.class);
		method.setAccessible(true);
		method.invoke(testItem, input);
	}
	
	/*
	 * Test Type : Black Box Testing
	 * Purpose : Ensure calculus operation
	 * input : a=1,b=1,c=1,x=1
	 * expected : 3 
	 */
	@Test
	void testgetLimitApproachesNumber() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new LimitOfAPolynomial();
		Method method;
		int a = 1, b=1, c=1, x = 1;
		int actual=3;
		method = testItem.getClass().getDeclaredMethod("getLimitApproachesNumber", int.class, int.class, int.class, int.class);
		method.setAccessible(true);
		int result = (int) method.invoke(testItem, a, b, c, x);
		assertEquals(result, actual);
	}
	
	/*
	 * Test type : Black Box Testing (Pseudo Table Testing)
	 * Purpose : Check the getLimit function's boundary value 
	 * input : a=0, b=0, c=1 (a=0, b=0)
	 * Expected : Print "The limit is: " + c + " at both +�닞 and -�닞"
	 */
	@Test
	void testAandBisZeroGetLimit() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new LimitOfAPolynomial();
		Method method;
		int a=0, b=0, c=1;
		method = testItem.getClass().getDeclaredMethod("getLimit", int.class, int.class, int.class);
		method.setAccessible(true);
		method.invoke(testItem, a, b, c);
	}
	
	/*
	 * Test type : Black Box Testing (Pseudo Table Testing)
	 * Purpose : Check the getLimit function's boundary value 
	 * input : a=0, b=1, c=1 (a=0, b>0)
	 * Expected : Print "There is no limit, as x approaches +�닞 the answer is: +�닞 , as x approaches -�닞 the answer is: -�닞 "
	 */
	@Test
	void testAiszeroGetLimit() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new LimitOfAPolynomial();
		Method method;
		int a=0, b=1, c=1;
		method = testItem.getClass().getDeclaredMethod("getLimit", int.class, int.class, int.class);
		method.setAccessible(true);
		method.invoke(testItem, a, b, c);
	}
	
	/* 
	 * Test type : Black Box Testing (Pseudo Table Testing)
	 * Purpose : Check the getLimit function's boundary value
	 * input : a=0, b=-1. c=1 (a=0, b<0)
	 * Expected : Print "There is no limit, as x approaches +�닞 the answer is: -�닞 , as x approaches -�닞 the answer is: +�닞"
	 */
	@Test
	void testAisZeroAndBisMinusGetLimit() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new LimitOfAPolynomial();
		Method method;
		int a=0, b=-1, c=1;
		method = testItem.getClass().getDeclaredMethod("getLimit", int.class, int.class, int.class);
		method.setAccessible(true);
		method.invoke(testItem, a, b, c);
	}
	
	/* 
	 * Test type : Black Box Testing (Pseudo Table Testing)
	 * Purpose : Check the getLimit function's boundary value
	 * input : a=1, b=1, c=1 (a>0)
	 * Expected : Print "There is no limit, as x approaches +�닞 the answer is: +�닞 , as x approaches -�닞 the answer is: -�닞"
	 */
	@Test
	void testAisPlusGetLimit() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new LimitOfAPolynomial();
		Method method;
		int a=1, b=1, c=1;
		method = testItem.getClass().getDeclaredMethod("getLimit", int.class, int.class, int.class);
		method.setAccessible(true);
		method.invoke(testItem, a, b, c);
	}
	
	/*
	 * Test type : Black Box Testing (Pseudo Table Testing)
	 * Purpose : Check the getLimit function's boundary value
	 * input : a=-1, b=-1, c=1 (a<0)
	 * Expected : Print "There is no limit, as x approaches +�닞 the answer is: -�닞 , as x approaches -�닞 the answer is: +�닞"
	 */
	@Test
	void testAisMinusGetLimit() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		testItem = new LimitOfAPolynomial();
		Method method;
		int a=-1, b=-1, c=1;
		method = testItem.getClass().getDeclaredMethod("getLimit", int.class, int.class, int.class);
		method.setAccessible(true);
		method.invoke(testItem, a, b, c);
	}
}
