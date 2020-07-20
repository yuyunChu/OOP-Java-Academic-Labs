package cst8284.calculator;

public class Complex {
	private double real = 0;
	private double imag = 0;

	// Complex constructor that takes in a single string, e.g. "2-4i"
	public Complex(String cStr) {
		this(cStr.replace(" ", "").split("(?=\\+)|(?=\\-)")); // splits cStr at + or - into an
		// array of strings having two elements. The first element of the
		// resultant array will be the real portion, while the second is the
		// imaginary portion. This array is passed to the next constructor.
	}

	// Complex constructor that takes in an array of two strings from the above
	// constructor e.g. cStr[0]="2", cStr[1]="-4i"
	public Complex(String[] cStr) {
		this(cStr[0], cStr[1]);
	}

	// Complex constructor that takes two separate strings as parameters, e.g. "2"
	// and "-4i"
	public Complex(String r, String i) {
		this(Double.parseDouble(r), Double.parseDouble(i.replace("i", "")));
	}

	public Complex(int r, int i) {

		this((double) r, (double) i);

	}

	public Complex(double r, double i) {
		setReal(r);
		setImag(i);
	}

	public Complex() {
		this(0, 0);
	}

	public double getReal() {
		return real;
	}

	// TODO: Write a getter called getImag() that returns the imaginary value of the
	// Complex number
	public double getImag() {
		return imag;
	}

	public void setReal(double r) {
		this.real = r;
	}

	public void setImag(double i) {
		this.imag = i;
	}

	public Complex getComplex() {
		return this;
	}

	public String toString() {
		return getReal() + ((getImag() < 0) ? " - " : " + ") + Math.abs(getImag()) + "i";
	}

	public boolean isZero() {
		return ((getReal() == 0 && getImag() == 0));
	}

	public Complex conjugate() {
		return new Complex(getReal(), -1 * getImag());
	}
//Lab 4 Test
	public boolean equals(String c) {
		return equals(new Complex(c));
	}

	public boolean equals(int real, int imag) {
		return equals(new Complex(real, imag));
	}
	
	public boolean equals(Complex c) {
		return equals(c.getReal(), c.getImag(), Double.parseDouble("1e-12"));
	}
	
	public boolean equals(double real, double imag, double delta) {
		delta = Math.abs(delta);
		
		if(this.getReal() >= real - delta && this.getReal() <= real + delta && 
				this.getImag() >= imag - delta && this.getImag() <= imag + delta)
			return true;
		else
			return false;
	}
//Lab 4 Test
}
