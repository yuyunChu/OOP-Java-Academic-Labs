package cst8284.genericTable;

/* Course Name: CST8284_310
*  Student Name: Chu,Yu-Yun
*  Class name: Square
*  Date: Apr. 2nd, 2020
*/

public class Square extends BasicShape {

	public Square(double width) {
		super(width);
	}

	public Square() {
		this(1.0);
	}

	public Square(Square square) {
		this(square.getWidth());
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Square))
			return false;
		Square square = (Square) obj;
		return (super.equals(obj) || super.getWidth() == square.getWidth());
	}

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
		return (super.toString());

	}

}
