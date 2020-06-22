import static org.junit.Assert.*;

 
import org.junit.Test;


public class simpleinterestTest {
	
	/**
	 * Purpose : test getSimpleInterest() 
	 * Input : (10,30,20), (5,8,40)
	 * Expected :
	 * 		input = 10,30,20  -> result = 60
	 * 		input = 5,8,40    -> result = 16
	 */
	@Test
	public void testGetSimpleInterest() {
		assertEquals(60, simpleinterest.getSimpleInterest(10,30,20));
		assertEquals(16, simpleinterest.getSimpleInterest(5,8,40));
	}
}
