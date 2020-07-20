package cst8284.solidObject;
/* Course Name: CST8284_310
*  Student Name: Chu,Yu-Yun
*  Student Number: 040961236
*  Class name: Square
*  Date: Mar. 21st, 2020
*/
import java.util.Objects;

public class Square extends BasicShape {

	public Square(double width) {
		super(width);
	}

	public Square() {
		this(1);
	}

	public Square(Square square) {
		super(square.getWidth());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Square)) {
			return false;
		}
		Square square = (Square) obj;
		return (super.equals(obj) || super.getWidth() == square.getWidth());
	}

// https://www.javatpoint.com/java-math
	@Override
	public double getArea() {
		double area = Math.pow(getWidth(), 2);
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = 4 * getWidth();
		return perimeter;
	}
	
	@Override
	public String toString() {
		return ("Square extends " + super.toString());
		
	}
}
