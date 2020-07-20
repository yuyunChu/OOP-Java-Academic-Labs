package cst8284.shape;
/*
1. Extend the Square class to a Rectangle class, and add a height field, complete with getters and setters.  
Override getArea() and getPerimeter() in your new class with the appropriate equations.

Add new constructors to your subclass (of the same type as the parent class).  
For the no-arg constructor, assume a default value of 1.0 for the value of the new dimension you just added.  
Also, be sure to add a copy constructor.  As always, use the getters and setters everywhere; 
do not reference private fields directly. (5 marks)


2. Using the new subclass you created in question 1, make JUnit tests to test the following:
	a. Instantiate a Rectangle object and a Square object having equal width and height (if 
	comparing a Circle/Ellipse or Square/Rectangle) or length (if comparing Triangles), and 
	use assertEquals() to show that the two objects have the same perimeter to within 1e-12.
	b. Instantiate a Rectangle object and a Square object using the default constructor for each, 
	and use assertEquals() to show that the two objects have the same area to within 1e-12.

Of course, your unit test code should be in its own separate package. (2 marks ea.)

3. Override the equals() method in your new subclass, being certain to use the superclass equals() 
method in your code to simplify the task.  Now assume you were to extend your new class into a newer 
subclass, one that adds a third dimension, i.e. a depth field.  
Explain to the lab instructor in words what the equals() method would look like in your new 'Block' class. (5 marks)

4. Does equals() do the same thing as ‘==’ when comparing two objects?  Why or why not? (2 marks)
== only comparing the primitive data type(8: char byte int long double float short boolean)
other than that, all other reference data type (String, array, class) comparing should use equals(), 

*/
public class Rectangle extends Square {

	private double height;
	
//	public Rectangle(double width) {
//		super(width);
//		setHeight(1.0);
//	}
	
	public Rectangle(double height, double width) {
		super(width);
		setHeight(height);
	}

	public Rectangle() {
		this(1.0, 1.0);
	}
// Lack of constructor!!!	
//	public Rectangle(Rectangle rectangle) {
//		super(rectangle.getWidth());
//	}

	public Rectangle(Rectangle rectangle) {
		this(rectangle.getHeight(), rectangle.getWidth());
	}
	
	public double getHeight() {
		return (this.height);
	}
	
	public void setHeight(double h) {
		this.height = h;
		
	}
	
	@Override
	public double getArea() {
		double area = getWidth()*getHeight();
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = 2 * (getHeight() + getWidth());
		return perimeter;
	}
/*
3. Override the equals() method in your new subclass, being certain to use the superclass equals() 
method in your code to simplify the task.  Now assume you were to extend your new class into a newer 
subclass, one that adds a third dimension, i.e. a depth field.  
Explain to the lab instructor in words what the equals() method would look like in your new 'Block' class. (5 marks)	
 */
	@Override
	  public boolean equals(Object obj){ //Square.equals() is a now a hidden field
	    if(! (obj instanceof Rectangle)){
	      return false;
	    } 
	    Rectangle rectangle = (Rectangle) obj;
//	    Block block = (Block) obj;
	    return(super.equals(obj) && this.getHeight() == rectangle.getHeight());
// if remove above 'super', its statement uses current boolean equals method in this class!	    
/*  //Block class   
* 	public boolean equals(Object obj){ //Square.equals() is a now a hidden field
* 	 if(! (obj instanceof Block)){
*		return false;
*	} 
*		    Block block = (Block) obj;
*	  //return(super.equals(obj) && this.getDepth() == block.getDepth());
*
*			Color color = (Color) obj;
*	  //return(super.equals(obj) && this.getColor() == color.getColor());
*	
*/
/* https://stackoverflow.com/questions/12244670/hiding-fields-in-java-inheritance
 * https://docs.oracle.com/javase/tutorial/java/IandI/super.html
 * Accessing Superclass Members
If your method overrides one of its superclass's methods, 
you can invoke the overridden method through the use of the keyword super. 
You can also use super to refer to a hidden field (although hiding fields is discouraged). */
	}
}
