package cst8284.shape;

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
