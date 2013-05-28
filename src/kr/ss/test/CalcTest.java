
package kr.ss.test;

import junit.framework.TestCase;

public class CalcTest extends TestCase {
	public void testAdd() throws Exception {
		Calc calc = new Calc();
		assertEquals(3, calc.add(1, 2));
	}
	public void testSubtract() throws Exception {
		Calc calc = new Calc();
		assertEquals(3, calc.subtract(5, 2));
	}
	public void testMultiply() {
		Calc calc = new Calc();
		assertEquals(4, calc.multiply(2, 2));
	}
	
	public void testDivide() {
		Calc calc = new Calc();
		assertEquals(4, calc.divide(8, 2));
	}
	
	public void testDivideBy0() {
		Calc calc = new Calc();
		assertEquals(-1, calc.divide(8, 0));
	}
	
}