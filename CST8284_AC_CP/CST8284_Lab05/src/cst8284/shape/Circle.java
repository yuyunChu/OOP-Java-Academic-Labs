package cst8284.shape;

import java.util.Objects;

public class Circle extends BasicShape {
	public Circle(double width) {
		super(width);
	}

	public Circle() {
		super(1);
	}

	public Circle(Circle circle) {
		super(circle.getWidth());
	}

	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Circle)) {
			return false;
		}
		Circle circle = (Circle) obj;
		return (super.equals(obj) || super.getWidth() == circle.getWidth());
	}


	@Override
	public double getArea() {
		double area = (Math.PI * Math.pow(getWidth(), 2)) / 4;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = (Math.PI * getWidth());
		return perimeter;
	}

	@Override
	public String toString() {
		return ("Circle extends " + super.toString());

	}
}
