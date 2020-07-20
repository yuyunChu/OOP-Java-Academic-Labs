package test.cst8284.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import cst8284.calculator.Complex;

public class TestComplex {

	private String real;
	private String imag;

	@Test
	public void testSetRealVia2IntConstructor() {
		Complex c = new Complex(3, 2);
		assertEquals(c.getReal(), 3, 0);
	}

	@Test
	public void testSetImagVia2IntConstructor() {
		Complex c = new Complex(3, 2);
		assertEquals(c.getImag(), 2, 0);
	}

	@Test
	public void test() {
		Complex c = new Complex(3, 2);
		assertTrue(c.equals("3.0 + 2.0i"));
	}

}
