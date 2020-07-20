package cst8284.calculator;

public class ComplexCalculator {

	private java.util.Scanner op = new java.util.Scanner(System.in);
	private Complex c; // stores result of current calculation

	public ComplexCalculator(Complex c1, Complex c2) {

		System.out.println("Which math operation do you wish to perform?  Enter +, -, *, /");
		
		switch (op.nextLine().charAt(0)) {
		case '+':
			setComplexResult(add(c1, c2));
			break;
		case '-':
			setComplexResult(subtract(c1, c2));
			break;
		case '*':
			setComplexResult(multiply(c1, c2));
			break;
		case '/':
			setComplexResult(divide(c1, c2));
			break;
		default:
			System.out.println("Unknown operation requested");
		}
	}

	public ComplexCalculator() {
	} // Needed for Lab 4; do not change

	public static Complex add(Complex c1, Complex c2) {
		double real = c1.getReal() + c2.getReal(); // As per the Lab Appendix
		double imag = c1.getImag() + c2.getImag();
		return (new Complex(real, imag));
	}

	public static Complex subtract(Complex c1, Complex c2) {
		double real = c1.getReal() - c2.getReal();
		double imag = c1.getImag() - c2.getImag();
		double subtraction = real + imag;
		return (new Complex(real, imag));
	}

	public static Complex multiply(Complex c1, Complex c2) {
		double real = (c1.getReal() * c2.getReal()) - (c1.getImag() * c2.getImag());
		double imag = (c1.getReal() * c2.getImag()) + (c1.getImag() * c2.getReal());
		double multiplication = real + imag;
		return (new Complex(real, imag));
	}

//	public Complex divide(Complex c1, Complex c2) {

//		// return a constructor with value 0 + 0i);
////		if(c2.getReal()==0 && c2.getImag()==0) {
//		if(c2.isZero()) {
//			System.out.println("Divide-by-zero error detected");
//			return (new Complex(0,0));
//		}	
//		else {
//			double real = (((c1.getReal() * c2.getReal()) + (c1.getImag()*c2.getImag()))/((c2.getReal()*c2.getReal())+(c2.getImag()*c2.getImag())));
//			double imag = (((c2.getReal() * c1.getImag()) - (c1.getReal()*c2.getImag()))/((c2.getReal()*c2.getReal())+(c2.getImag()*c2.getImag())));
//			double division = real + imag;		
//		    return (new Complex(real, imag));
//		}
//	}

	public Complex divide(Complex c1, Complex c2) {

		if (c2.isZero()) {
			System.out.println("Divide-by-zero error detected");
			return (new Complex(0, 0));
		} else {
			Complex c2_conjugate = c2.conjugate();
			
			Complex numerator = multiply(c1, c2_conjugate);
				
			double denominator = multiply(c2, c2_conjugate).getReal();
			
			return (new Complex(numerator.getReal()/denominator, numerator.getImag()/denominator));			
		}		
	}

	public void setComplexResult(Complex c) {
		this.c = c;
	}

	public Complex getComplexResult() {
		return c;
	}

	public String toString() {
		return c.toString();
	}
}
