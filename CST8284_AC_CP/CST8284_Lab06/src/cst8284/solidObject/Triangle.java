package cst8284.solidObject;
/* Course Name: CST8284_310
*  Student Name: Chu,Yu-Yun
*  Student Number: 040961236
*  Class name: Triangle
*  Date: Mar. 21st, 2020
*/
import java.util.Objects;

public class Triangle extends BasicShape {
	public Triangle(double width) {
		super(width);
	}

	public Triangle() {
		this(1);
	}

	public Triangle(Triangle triangle) {
		super(triangle.getWidth());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Triangle)) {
			return false;
		}
		Triangle triangle = (Triangle) obj;
		return (super.equals(obj) || super.getWidth() == triangle.getWidth());
	}
	

	@Override
	public double getArea() {
		double area = Math.sqrt(3) * Math.pow(getWidth(), 2) / 4;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = 3 * getWidth();
		return perimeter;
	}
	
	@Override
	public String toString() {
		return ("Triangle extends " + super.toString());
		
	}

}
