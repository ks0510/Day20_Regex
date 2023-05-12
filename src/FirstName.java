/*
 * This java program check valid first name using regex.
 */
package regexnew;

import java.util.regex.Pattern;
import java.util.*;
/**
 * 
 * @author Kaif
 *
 */

public class FirstName {
	
	/*
	 * Method to check first name valid or not by regex pattern
	 */
	public static void tofirstName(String firstName) {
		
		boolean result = Pattern.matches("\\p{Upper}(\\p{Lower}+\\s?){2}",firstName);
		
		if(result) {
			System.out.println("This first name is valid");
		}
		else {
			System.out.println("This first name is not valid");
		}
	}
	/**
	*This is main method  of program
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name");
		
		String firstName = sc.next();
		
		/*
		 * To call out method to validate first name
		 */
		tofirstName(firstName);

	}
}
