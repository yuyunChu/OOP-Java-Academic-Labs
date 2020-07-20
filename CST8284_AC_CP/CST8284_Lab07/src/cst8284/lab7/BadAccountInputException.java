package cst8284.lab7;
/* Course Name: CST8284_310
*  Student Name: Chu,Yu-Yun
*  Student Number: 040961236
*  Class name: BadAccountInputException
*  Date: Mar. 23rd, 2020
*/
import java.lang.RuntimeException;

public class BadAccountInputException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public BadAccountInputException(String s) {
		super(s);
	}

	public BadAccountInputException() {
		this("Bad input: value entered is incorrect");
	}

}
