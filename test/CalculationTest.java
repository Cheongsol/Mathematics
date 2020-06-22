import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculationTest {
	private static Calculation testItem ;
	@BeforeClass
	public static void setUp() throws Exception { testItem = new Sine(); }
	@AfterClass
	public static void tearDown() throws Exception { testItem = null; }

	/**
	 * Purpose : test convertToRadians() 
	 * Input : "30","60"
	 * Expected :
	 * 		input = "30" -> result = 0.5235987755982988
	 * 		input = "60" -> result = 1.0471975511965976
	 */
	@Test
	public void testConvertToRadians() {
		testItem.angle="30";
		assertEquals(0.5235987755982988, testItem.convertToRadians(),0);
		
		testItem.angle="60";
		assertEquals(1.0471975511965976, testItem.convertToRadians(),0);
		
	}
	
	/**
	 * Purpose : test convertToDouble() 
	 * Input : "30","60"
	 * Expected :
	 * 		input = "30" -> result = 30
	 * 		input = "60" -> result = 60
	 */
	@Test
	public void testConvertToDouble() {
		testItem.angle="30";
		assertEquals(30.0, testItem.convertToDouble(),0);
		
		testItem.angle="60";
		assertEquals(60.0, testItem.convertToDouble(),0);
		
	}
	
	/**
	 * Purpose : test getValue() for Sine class
	 * Input : "45", "180"
	 * Expected :
	 * 		input = "45"  -> result = 0.7071067811865475
	 * 		input = "180" -> result = 0.0
	 */
	@Test
	public void testGetValueSine() {
		testItem.angle="45";
		assertEquals(0.7071067811865475, testItem.getValue(),0);
		
		testItem.angle="180";
		assertEquals(0.0, testItem.getValue(),0);
	}
}
