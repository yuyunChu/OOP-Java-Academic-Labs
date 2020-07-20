package cst8284.calculator;

public class Complex {
	private double real = 0;
	private double imag = 0;
	
	// Complex constructor that takes in a single string, e.g. "2-4i"
	public Complex(String cStr){
		this(cStr.split("(?=\\+)|(?=\\-)"));  // splits cStr at + or - into an 
		// array of strings having two elements.  The first element of the 
		// resultant array will be the real portion, while the second is the 
		// imaginary portion.  This array is passed to the next constructor.
	}
	
	// Complex constructor that takes in an array of two strings from the above 
	// constructor e.g. cStr[0]="2", cStr[1]="-4i"
	public Complex(String[] cStr){
		this(cStr[0], cStr[1]);
	}

	
	// Complex constructor that takes two separate strings as parameters, e.g. "2" and "-4i"
	public Complex(String r, String i){
		
		this(Integer.parseInt(r), Integer.parseInt(i.replace("i", "")));		
	}
	
	
	public Complex(int r, int i){
		
		this((double) r, (double) i);
		
	}
	
	public Complex(double r, double i){
		setReal(r);
		setImag(i);
	}
	
	public Complex(){this(0,0);	}
		
	public double getReal() {		
		return real;
	}
	
	// TODO: Write a getter called getImag() that returns the imaginary value of the Complex number
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
		return getReal() + getImag() < 0 ? " - ":" + " + Math.abs(getImag());
//		char sign = ' ';
//		double imag2 = imag;
//		
////		
//		if(imag >= 0) {
//			sign = '+';
//		}
//		if(imag < 0) {
//			sign = '-';
////			imag2 *= -1;
//		}
//		
//		return real + " " + sign + " " + imag2 + "i";
//		String printResult = "";
//		if(getReal() %1 ==0) {
//			printResult = String.format("%.1f", getReal());
//			
//		}else {
//			printResult = String.format("%.3f", getReal());
//		}
//		if(getImag() >= 0) {
//			printResult = printResult + " + ";
//		}else {
//			printResult = printResult + " ";
//		}if(getImag() %1 ==0 ) {
//			printResult = printResult + String.format("%.1fi", getImag());
//		}else {
//			printResult = printResult + String.format("%.3fi", getImag());
//		}
//		return printResult;
	}
	
		public boolean isZero() {		
//// need to return true or false
//			return ((getReal()==0 && getImag()==0) ? true : false); //Ternary Operator
			return ((getReal()==0 && getImag()==0));
		}
	
		public Complex conjugate() {			
			return new Complex(getReal(), -1 * getImag());     
		}
}
