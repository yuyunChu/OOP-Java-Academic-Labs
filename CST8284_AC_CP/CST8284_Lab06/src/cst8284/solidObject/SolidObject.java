package cst8284.solidObject;
/* Course Name: CST8284_310
*  Student Name: Chu,Yu-Yun
*  Student Number: 040961236
*  Class name: SolidObject
*  Date: Mar. 21st, 2020
*/
public class SolidObject<T extends BasicShape> {
	// TODO: Use the UML diagram to create the members required in the space below
	private T shape;
	private double depth;

	public SolidObject(T shape, double depth) {
		setBasicShape(shape);
		setDepth(depth);
	}

	public SolidObject(T shape) {
		this(shape, shape.getWidth());
	}

	public T getBasicShape() {
		return shape;
	}

	public void setBasicShape(T shape) {
		this.shape = shape;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getVolume() {
		
		return getDepth() * shape.getArea();
	}

	public double getSurfaceArea() {
		return shape.getPerimeter() * getDepth() + 2 * shape.getArea();
	}

	// the toString() method is provided for you -- do not remove
	public String toString() {
		String solidTypeEquivalent = "unknown   ";
		switch (getBasicShape().getClass().getSimpleName()) {
		case "Circle":
			solidTypeEquivalent = "cylinder ";
			break;
		case "Square":
			solidTypeEquivalent = "block     ";
			break;
		case "Triangle":
			solidTypeEquivalent = "prism    ";
			break;
		}
		return solidTypeEquivalent;
	}

}
