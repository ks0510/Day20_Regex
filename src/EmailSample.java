/*
 * This java program which check all email samples are valid or not
 */
package regexnew;
import java.util.regex.Pattern;
import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class EmailSample {
	
	/*
	 * To define method to validate email
	 */
	public static void toCheckEmail(String email) {
		/*
		 * Setting regex pattern given in UC
		 */
		boolean result = Pattern.matches("[a][b][c][a-zA-Z0-9.@+_-]{1,}",email);
		if(result) {
			System.out.println(email+": This email is valid");
		}
		else {
			System.out.println(email+": This  is not valid");
		}
	}
	
	/**
	 * This is main method of program
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Taking input from sample pdf
		 */
		toCheckEmail("abc@yahoo.com");
		toCheckEmail("abc-100@yahoo.com");
		toCheckEmail("abc.100@yahoo.com");
		toCheckEmail("abc111@abc.com");
		toCheckEmail("abc-100@abc.net");
		toCheckEmail("abc.100@abc.com.au");
		toCheckEmail("abc@1.com");
		toCheckEmail("abc@gmail.com.com");
		toCheckEmail("abc+100@gmail.com");
	}
}
