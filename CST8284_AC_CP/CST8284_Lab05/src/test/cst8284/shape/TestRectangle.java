package test.cst8284.shape;

import static org.junit.Assert.*;

import org.junit.Test;

import cst8284.shape.Rectangle;
import cst8284.shape.Square;

public class TestRectangle {
//	2. Using the new subclass you created in question 1, make JUnit tests to test the following:
//		a. Instantiate a Rectangle object and a Square object having equal width and height (if 
//		comparing a Circle/Ellipse or Square/Rectangle) or length (if comparing Triangles), and 
//		use assertEquals() to show that the two objects have the same perimeter to within 1e-12.
//		b. Instantiate a Rectangle object and a Square object using the default constructor for each, 
//		and use assertEquals() to show that the two objects have the same area to within 1e-12.
	@Test
	public void testPerimeter() {
		Square ob1 = new Square(1.0);
		Rectangle ob2 = new Rectangle(1.0,1.0);
//		double obj1Perm = ob1.getPerimeter();
//		double obj2Perm = ob2.getPerimeter();
//
//		assertEquals(obj1Perm, obj2Perm, 1e-12);
		assertEquals(ob1.getPerimeter(), ob2.getPerimeter(), 1e-12);
	}
	
	@Test
	public void testArea() {
		Square ob1 = new Square(1.0);
		Rectangle ob2 = new Rectangle(1.0, 1.0);
//		double obj1Area = ob1.getArea();
//		double obj2Area = ob2.getArea();
//		assertEquals(obj1Area, obj2Area, 1e-12);
		assertEquals(ob1.getArea(), ob2.getArea(), 1e-12);
	}
}
