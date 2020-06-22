package Algebra.Intercepts;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class TestIntercepts {
	
	InterceptsOfALine testHorizontal= new InterceptsOfALine();
	InterceptsOfALine testIntercepts = new InterceptsOfALine();
	InterceptsOfALine testPoint = new InterceptsOfALine();
	InterceptsOfALine testSlope = new InterceptsOfALine();
	InterceptsOfALine testVertical = new InterceptsOfALine();
	
	@Test
	public void testHorizontal() {
		testHorizontal.main(null);
	}
	
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
	
	@Test
	public void testVertical() {
		testVertical.main(null);
	}
}
