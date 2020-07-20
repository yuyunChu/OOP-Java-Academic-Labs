package cst8284.solidObject;
/* Course Name: CST8284_310
*  Student Name: Chu,Yu-Yun
*  Student Number: 040961236
*  Class name: BasicShape
*  Date: Mar. 21st, 2020
*/

public abstract class BasicShape {
	
	private double width;
	protected BasicShape(double width) {setWidth(width);}
	
	public /*concrete*/ double getWidth(){return width;}
	public /*concrete*/ void setWidth(double width){this.width = width;}
			
	@Override
	public String toString(){
		return ("BasicShape extends " + super.toString());
	}
	
	public abstract double getArea(); /* abstract method does not have a body */
	
	public abstract double getPerimeter();
	
}
