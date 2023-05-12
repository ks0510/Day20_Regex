/*
 * This java program generate regex for strong password according to rules
 */
package regexnew;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * 
 * @author Kaif
 *
 */

public class Password2 {

	/*
	 * To define check valid password
	 */
	public static void checkPassword2(String password) {
		/*
		 * To define regex for password according to rules and matching password with
		 * expression
		 */
		boolean result = Pattern.matches("[a-z]{7,}[A-Z]{1,}", password);

		if (result) {
			System.out.println("Password is valid");
		} else {
			System.out.println("Password is invalid");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter password");

		String password = sc.next();

		checkPassword2(password);
	}
}
