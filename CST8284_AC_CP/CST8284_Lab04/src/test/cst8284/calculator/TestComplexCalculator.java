package test.cst8284.calculator;

import cst8284.calculator.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestComplexCalculator {

//	@Test
//	public void testToString() {
//		Complex c = new Complex(3, 2);
//		assertTrue(c.toString().equals("3.0 + 2.0i"));
//	}

// 1. Use assertNotNull() to test that the ComplexCalculator()'s getComplexResult() method
//does not return null (1 mark) ===> Green bar! :)
	@Test
	public void testGetComplexResult() {
		ComplexCalculator c = new ComplexCalculator();
		c.setComplexResult(new Complex(3, 2));
		assertNotNull(c.getComplexResult());
	}

// 2. Use assertEquals(double, double, double) to test if 
//getReal() returns the correct value set using the Complex(String[]) constructor (1 mark)
// https://junit.org/junit4/javadoc/4.8/org/junit/Assert.html
	@Test
	public void testGetReal() {
		String[] cStr = new String[] { "2", "-4i" };
		Complex c = new Complex(cStr);
		assertEquals(2, c.getReal(), 0);
	}

// 3. Use assertEquals(double, double, double) to test if 
//setImag() correctly resets the value set using the Complex(int, int) constructor (1 mark)
// https://junit.org/junit4/javadoc/4.8/org/junit/Assert.html
	@Test
	public void testSetImag() {
		Complex c = new Complex(3, 3);
		c.setImag(2);
		assertEquals(2, c.getImag(), 0);
	}

// 4. Use the no-arg Complex() constructor, and then use the real and imaginary setters to 
//set new integer values.  Then use assertTrue(boolean) to test the validity of your newly-added 
//equals(Complex) method (1 mark)
	@Test
	public void testEquals() {
		Complex c = new Complex();
		c.setReal(4);
		c.setImag(3);
		assertTrue(c.equals(new Complex(4, 3)));
	}

// 5. Using assertTrue(boolean), test that two Complex numbers created using the Complex(String, String) 
// constructor and the Complex(double, double) constructor give the correct result using the multiply() method.  
// Use equals(Complex) to compare the actual and expected result (1 mark)
// https://www.symbolab.com/solver/complex-numbers-calculator/%5Cleft(1%2B1i%5Cright)%5Cleft(1%2B1i%5Cright)
	@Test
	public void testMultiply() {
		Complex c = new Complex("1", "1");
		Complex d = new Complex(1, 1);
		Complex multiplication = ComplexCalculator.multiply(c, d);
		assertTrue(multiplication.equals(new Complex(0, 2)));
	}

// 6. Using one or more for() loops over a range of values, check that (A + Bi)*(A - Bi) is a 
//	pure real number, i.e. that imag = 0 for each possible combination (3 marks)
//Method 1:
	@Test
	public void testForLoop() {

		for (int A = 0; A < 10; A++) {
			for (int B = 0; B < 10; B++) {
				// (A + Bi)*(A - Bi)
				Complex c = new Complex(A, B);
				Complex d = new Complex(A, -B);
				Complex multiplication = ComplexCalculator.multiply(c, d);
				assertEquals(multiplication.getImag(), 0, 0);
//				assertTrue(multiplication.getImag()==0);
			}
		}
	}
//Method 2:
	@Test
	public void testGetImag() {

		for (int A = 0; A < 10; A++) {
			for (int B = 0; B < 10; B++) {
				// (A + Bi)*(A - Bi)
				Complex c = new Complex(A, B);
				Complex d = new ComplexCalculator().multiply(c, c.conjugate());
				assertEquals(d.getImag(), 0.0, 1e-12);
			}
		}
	}
}
