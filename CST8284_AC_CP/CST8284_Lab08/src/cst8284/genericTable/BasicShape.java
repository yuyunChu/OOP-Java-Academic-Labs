package cst8284.genericTable;

/* Course Name: CST8284_310
*  Student Name: Chu,Yu-Yun
*  Class name: BasicShape
*  Date: Apr. 2nd, 2020
*/
public abstract class BasicShape implements Comparable<BasicShape> {

	private double width;

	protected BasicShape(double width) {
		setWidth(width);
	}

	/* concrete */
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public int compareTo(BasicShape obj) {
		double result = getArea() - obj.getArea();
		return Math.abs(result) < 1e-8 ? 0 : result > 0 ? 1 : -1;
	}

// https://www.javatpoint.com/java-object-getclass-method
// https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html
	@Override
	public String toString() {
		return (getClass().getSimpleName());
	}

	/* abstract method does not have a body */
	public abstract double getArea();

	public abstract double getPerimeter();

}
