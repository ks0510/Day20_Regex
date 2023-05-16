/*
 * This java program implement lambda expressions for regex pattern matching
 */
package regexnew;
import java.util.regex.Pattern;
import java.util.*;
/**
 * 
 * @author Kaif
 *
 */

/*
 * To define interface for firstname 
 */
interface FirstNameL{
	boolean checkFirstName(String fName);
}
/*
 * To define interface for lastname 
 */
interface LastNameL{
	boolean checkLastName(String lName);
}

/*
 * To define interface for email
 */
interface EamilL{
	boolean checkEmail(String emailId);
}

/*
 * To define interface for phone number
 */
interface PhoneNumber1{
	boolean checkPhoneNumber(String phoneNumber);
}

/*
 * To define interface for password
 */
interface PasswordNew{
	boolean checkPassword(String password);
}


/*
 * This is main class of program
 */
public class LambdaExample {
	
	/**
	 * This is main method of program and starting point program
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name");
		String firstName = sc.next();
		
		/*
		 * To implement method logic using lambda expression
		 */
		checkFirstName(firstName,fName -> Pattern.matches("\\p{Upper}(\\p{Lower}+\\s?){2}",fName));
		
		System.out.println("Enter last name");
		String lastName = sc.next();
		
		/*
		 * To implement method logic using lambda expression
		 */
		checkLastName(lastName,lName -> Pattern.matches("\\p{Upper}(\\p{Lower}+\\s?){2}",lName));
		
		System.out.println("Enter email");
		String email = sc.next();
		
		/*
		 * To implement method logic using lambda expression
		 */
		checkEmail(email,emaiId -> Pattern.matches("[a][b][c][.][a-z]{1,10}[@][b][l][.][c][o][.][a-z]{1,10}",emaiId));

		System.out.println("Enter phone number");
		String number = sc.next();
		
		/*
		 * To implement method logic using lambda expression
		 */
		checkPhoneNumber(number,phoneNumber -> Pattern.matches("[1-9]{1}[0-9]{1} [6-9]{1}[0-9]{9}",phoneNumber));
		
		System.out.println("Enter password");
		String password1 = sc.next();
		
		/*
		 * To implement method logic using lambda expression
		 */
		checkPassword(password1,password -> Pattern.matches("[a-z]{1,}[A-Z]{1,}[0-9]{1,}[!@#$%^&*]", password));
	}
	
	/*
	 * We are defining only function here but we will define method logic in lamda expression
	 * To define method to validate first name
	 */
	public static void checkFirstName(String fName,FirstNameL firstname){
		boolean value = firstname.checkFirstName(fName);
		if(value) {
			System.out.println("First Name is valid");
		}
		else {
			System.out.println("First Name is invalid");
		}
	}
	
	/*
	 * To define method to validate last name
	 */
	public static void checkLastName(String lName,LastNameL lastname){
		boolean value = lastname.checkLastName(lName);
		if(value) {
			System.out.println("Last Name is valid");
		}
		else {
			System.out.println("Last Name is invalid");
		}
	}
	
	/*
	 * To define method to validate eamil
	 */
	public static void checkEmail(String emailId,EamilL email){
		boolean value = email.checkEmail(emailId);
		if(value) {
			System.out.println("Last Name is valid");
		}
		else {
			System.out.println("Last Name is invalid");
		}
	}
	
	/*
	 * To define method to validate phone number
	 */
	public static void checkPhoneNumber(String phoneNumber,PhoneNumber1 phonenumber1) {
		boolean value = phonenumber1.checkPhoneNumber(phoneNumber);
		if(value) {
			System.out.println("Phone number is valid");
		}
		else {
			System.out.println("Phone number is not valid");
		}
	}
	
	/*
	 * To define method to validate password
	 */
	public static void checkPassword(String password,PasswordNew passwordnew) {
		boolean value = passwordnew.checkPassword(password);
		if(value) {
			System.out.println("Password is valid");
		}
		else {
			System.out.println("Password is not valid");
		}
	}
}
