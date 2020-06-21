package Algebra;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAlgebra {
	@Before
	public void setUp() throws Exception {
		GCD Gcd = new GCD();
		Inverse inverse = new Inverse();
		lcm lcm = new lcm();
		logarithms logarithms = new logarithms();
		nearInt nearint = new nearInt();
	}
	@Test
	public void testGCD() {
		GCD.main(null);
	}
	@Test
	public void testInverse() {
		Inverse.main(null);
	}
	@Test
	public void testLcm() {
		lcm.main(null);
	}
	@Test
	public void testLogarithms() {
		logarithms.main(null);
	}
	@Test
	public void testNearInt() {
		nearInt.main(null);
	}

}
