package cst8284.lab7;
/* Course Name: CST8284_310
*  Student Name: Chu,Yu-Yun
*  Student Number: 040961236
*  Class name: Account
*  Date: Mar. 23rd, 2020
*/
import java.text.*;
import java.util.Calendar;
import java.util.Date;

public class Account {
	private String accountNumber = "000-000000"; // branch number - customer account number
	private String firstName, lastName;
	private static final Calendar ACCOUNTSTARTDATE = Calendar.getInstance();
	private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

	public Account(String accountNumber, String firstName, String lastName, String startDate) {
		dateFormat.setLenient(false);
		setAccountNumber(accountNumber);
		setFirstName(firstName);
		setLastName(lastName);
		setAccountStartDate(startDate);
	}

	private void setAccountNumber(String accountNumber) {
		// TODO #1: Run the QuestionGenerator and test for the error condition
		// indicated. If the condition exists, throw a BadAccountInputException
		// displaying the message provided; this exception will be caught by the
		// exception handler in the AccountLauncher class, and the user prompted
		// for a new input. Only if there is no error should the account number
		// (in the line below) be set. Note that in addition to the test indicated
		// in the QuestionGenerator, your code must also call the isCheckDigitCorrect()
		// method as well in determining whether to set the account number or not.
		/*
		 * TODO #1: Bad account number entered.
		 * Description of your code: The branch number cannot begin with a zero.
		 * Error message to output: "Branch number must be 100 or greater"
		 * Note that for this test you should only need to use the String methods
		 * indicated in the lab; under no circumstances should you need to dissect the
		 * account number character-by-character. You may use regular expressions
		 * (regex) if you find it convenient, but you should be able to perform this
		 * test using String methods only. (3 marks)
		 * 012-123456
		 * 0123
		 */
		
		String[] account = accountNumber.split("-");
		
		if(account[0].indexOf("0") == 0 || account[0].length() < 3) {
			throw new BadAccountInputException("Branch number must be 100 or greater");
		}else if(!isCheckDigitCorrect(account[1])) {
			throw new BadAccountInputException("Checkdigit failed; possible bad account number.");
		}		

		this.accountNumber = accountNumber;
	}

	private static boolean isCheckDigitCorrect(String accountNumber) {
		// TODO #2: Write the code here to test the account number, according to
		// the algorithm indicated in the QuestionGenerator. If the check digit
		// is correct then return true, otherwise false. Use the result to throw
		// a new BadAccountInputException in the setAccountNumber() method above, with
		// the message "Bad account number; check digit failed." if the result of
		// this method returns false.
/*TODO #2: Implement the following checksum algorithm and use it to trigger an exception if the customer account number is incorrect.  
Not only must your code work correctly with any six-digit account number according to the following algorithm, (where the last digit is always the check digit) 
it must also be scalable to any number of digits in the customer account number. 

Description of algorithm:
Every digit in an even-numbered position is multiplied by two, and added to the remaining digits in
odd-numbered positions. 
Modulus the sum of all digits by 9.  Then check that this number equals the last (i.e. check) digit  
Thus for the checksum 125537, the calculation would be 2*1 + 2 + 2*5 + 5 + 2*3 = 25.  25%9 = 7.

[Note: all digit positions are treated as zero-based.  Thus for the checkdigits 123456, 1, 3, and 5 are at positions 0, 2, and 4 (the even-numbered positions), 
while the numbers 2, 4 and 6 (the checkdigit) are at positions positions 1, 3, and 5 (the odd-numbered positions)].  
(10 marks)*/
		
		// 213-987654
		// 987654
				
				int sum = 0, i = 0;
				char ch;
				int digit;
		       
				
				for (i = 0; i < accountNumber.length() - 1; i++) {
					ch = accountNumber.charAt(i);
					digit = Integer.parseInt(Character.toString(ch));
					
					if(i % 2 == 0) {
						digit *= 2;
					}
					
					sum += digit;
						
				}
				
				return (sum % 9 == Integer.parseInt(Character.toString(accountNumber.charAt(i))));
		
	}

	private static boolean isInputNameCorrect(String name) {
		// TODO #3: Write the code here to test for the input name error condition
		// indicated
		// in the Lab 7 QuestionsGenerator, and throw a new BadAccountInputException
		// with
		// the message indicated. This exception will be caught in the AccountLanucher
		// class. Only if this error does not occur should this function return true.
		// Note that this test is used in checking the setters for both the first
		// and last names, below.
/*
 TODO #3: Bad first or last name entered.
Description of your code: Length of name cannot exceed 30 characters.
Error message to output: "Name cannot exceed 30 characters"
(3 marks)		
 */
		if(name.length() > 30) {
			throw new BadAccountInputException("Name cannot exceed 30 characters");
		}
		else
			return true;
		
	}

	public void setAccountStartDate(String startDate) {

		Date date;
		try {
			date = dateFormat.parse(startDate);
			ACCOUNTSTARTDATE.setTime(date);
		} catch (RuntimeException e) {
			throw new BadAccountInputException("General runtime exception thrown setting start date");
		} catch (ParseException e) {
			throw new BadAccountInputException("Format is YYYY-MM-DD");
		}
		
		// TODO #4: Wrap the above code in a try/catch block, and check the
		// QuestionGenerator for the two exceptions you'll need to test for.
/*
TODO #4: Bad account start date entered.

Description of your code: In separate catch blocks, check for the following two exceptions, indicated below.  
For each, throw a BadAccountInputException along with the message output indicated.

   Exception thrown		   Message output
  "RuntimeException"		"General runtime exception thrown setting start date"
  "ParseException"		"Format is YYYY-MM-DD"

(3 marks)
 */
	}

	private void setFirstName(String firstName) {
		if (isInputNameCorrect(firstName))
			this.firstName = firstName;
			
	}

	private void setLastName(String lastName) {
		if (isInputNameCorrect(lastName))
			this.lastName = lastName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Calendar getAccountStartDate() {
		return ACCOUNTSTARTDATE;
	}

	public String toString() {
		return "Customer name: " + getFirstName() + " " + getLastName() + "\nCustomer Account number: "
				+ getAccountNumber() + "\nAccount Created: " + getAccountStartDate().getTime().toString();
	}

}
