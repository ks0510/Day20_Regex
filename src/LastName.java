/*
 * This java program check valid last name using regex.
 */
package regexnew;
import java.util.*;
import java.util.regex.Pattern;
/**
 * 
 * @author Kaif
 *
 */
public class LastName {
	
	/*
	 * Method to check last name valid or not by regex pattern
	 */
	public static void tolastName(String lastName) {
		
		/*
		 * Defining regex pattern to validate last name
		 */
		boolean result = Pattern.matches("\\p{Upper}(\\p{Lower}+\\s?){2}",lastName);
		
		if(result) {
			System.out.println("This last name is valid");
		}
		else {
			System.out.println("This last name is not valid");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter last name");
		
		String lastName = sc.next();
		
		tolastName(lastName);
	}
}
