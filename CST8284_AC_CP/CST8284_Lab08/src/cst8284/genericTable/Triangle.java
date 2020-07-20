package cst8284.genericTable;

/* Course Name: CST8284_310
*  Student Name: Chu,Yu-Yun
*  Class name: Triangle
*  Date: Apr. 2nd, 2020
*/
public class Triangle extends BasicShape {

	protected Triangle(double width) {
		super(width);
	}

	public Triangle() {
		this(1.0);
	}

	public Triangle(Triangle triangle) {
		this(triangle.getWidth());
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Triangle))
			return false;
		Triangle triangle = (Triangle) obj;
		return getWidth() == triangle.getWidth();
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
		return (super.toString());
		
	}

}
