package cst8284.genericTable;
/* Course Name: CST8284_310
*  Student Name: Chu,Yu-Yun
*  Class name: Circle
*  Date: Apr. 2nd, 2020
*/

public class Circle extends BasicShape{
	
	public Circle(double width) {
		super(width);
	}
	
	public Circle() {
		this(1.0);
	}

	public Circle(Circle circle) {
		this(circle.getWidth());
	}
		
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Circle))
			return false;
		Circle circle = (Circle) obj;
		return getWidth() == circle.getWidth();
	}

	@Override
	public double getArea() {
		return Math.PI / 4 * getWidth() * getWidth();
	}

	@Override
	public double getPerimeter() {
		double perimeter = (Math.PI * getWidth());
		return perimeter;
	}
	
	@Override
	public String toString() {
		return (super.toString());
	}

}
