package Algebra.Intercepts;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class TestIntercepts {
	
	InterceptsOfALine testIntercepts = new InterceptsOfALine();
	InterceptsOfALine testPoint = new InterceptsOfALine();
	InterceptsOfALine testSlope = new InterceptsOfALine();
	
	@Test
	public void testInterceptsOfALine() {
		testIntercepts.main(null);
	}
	
	@Test
	public void testPointSlopeForm() {
		testPoint.main(null);
	}
	
	@Test
	public void testSlopeInterceptForm() {
		testSlope.main(null);
	}
}
