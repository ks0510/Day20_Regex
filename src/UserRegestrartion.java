/*
 * This java program handles invalid user details exception
 */
package regexexception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import regexexception.InvalidUserDetailsException;
import java.util.*;
/**
 * 
 * @author Kaif
 *
 */

/*
 * This is main class of program
 */
public class UserRegestrartion {
	String message;

	public UserRegestrartion(String message) {
		super();
		this.message = message;
	}

	public UserRegestrartion() {
		super();
	}

	/*
	 * Method to check first name valid or not by regex pattern
	 */
	public void tofirstName(String firstName) throws InvalidUserDetailsException {

		boolean result = Pattern.matches("\\p{Upper}(\\p{Lower}+\\s?){2}", firstName);

		if (result) {
			System.out.println("This first name is valid");
		} else {
			throw new InvalidUserDetailsException("Invalid last name");
		}
	}

	/*
	 * Method to check last name valid or not by regex pattern
	 */
	public void toLastName(String lastName) throws InvalidUserDetailsException {

		boolean result = Pattern.matches("\\p{Upper}(\\p{Lower}+\\s?){2}", lastName);

		if (result) {
			System.out.println("This last name is valid");
		} else {
			throw new InvalidUserDetailsException("Invalid last name");
		}

	}

	/*
	 * To define method to check email is valid or not
	 */
	public void toEmail(String email) throws InvalidUserDetailsException {

		/*
		 * To define regex for email
		 */
		boolean result = Pattern.matches("[a][b][c][.][a-z]{1,10}[@][b][l][.][c][o][.][a-z]{1,10}", email);

		if (result) {
			System.out.println("This email is valid");
		} else {
			throw new InvalidUserDetailsException("Invalid email");
		}
	}

	/*
	 * To define validate phone number by regex
	 */
	public void tophoneNumber(String phoneNumber) throws InvalidUserDetailsException {

		/*
		 * To define regex pattern
		 */
		Pattern pattern = Pattern.compile("^[1-9]{1}[0-9]{1} [6-9]{1}[0-9]{9}$");
		Matcher matcher = pattern.matcher(phoneNumber);
		boolean isValid = matcher.matches();

		if (isValid) {
			System.out.println("Phone Number is valid");
		} else {
			throw new InvalidUserDetailsException("Invalid phone number");
		}
	}

	/*
	 * To define check valid password
	 */
	public void checkPassword4(String password) throws InvalidUserDetailsException {
		/*
		 * To define regex for password according to rules and matching password with
		 * expression
		 */
		boolean result = Pattern.matches("[a-zA-Z]{1,}[A-Z]{1,}[0-9]{1,}[!@#$%^&*]", password);

		if (result) {
			System.out.println("Password is valid");
		} else {
			throw new InvalidUserDetailsException("Invalid password");
		}
	}
	
	/*
	 * This is main mehtod of program
	 */

	public static void main(String[] args) {

		UserRegestrartion user1 = new UserRegestrartion();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first name");

		String fName = sc.next();

		try {
			user1.tofirstName(fName);
		} catch (InvalidUserDetailsException e) {
			System.out.println(e);
		}

		System.out.println("Enter last name");

		String lName = sc.next();

		try {
			user1.toLastName(lName);
		} catch (InvalidUserDetailsException e) {
			System.out.println(e);
		}

		System.out.println("Enter eamil");

		String email = sc.next();

		try {
			user1.toEmail(email);
		} catch (InvalidUserDetailsException e) {
			System.out.println(e);
		}

		System.out.println("Enter phone number");

		String phoneNumber = sc.next();

		try {
			user1.tophoneNumber(phoneNumber);
		} catch (InvalidUserDetailsException e) {
			System.out.println(e);
		}
		
		System.out.println("Enter password");

		String paassword= sc.next();

		try {
			user1.checkPassword4(paassword);
		} catch (InvalidUserDetailsException e) {
			System.out.println(e);
		}
	}
}
