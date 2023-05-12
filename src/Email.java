/*
 * This java program check valid email using regex
 */
package regexnew;
import java.util.*;
import java.util.regex.Pattern;

/**
 * 
 * @author Kaif
 *
 */

public class Email {
	
	/*
	 * To define method to check email is valid or not
	 */
	public static void  toEmail(String email) {
		
		/*
		 * To define regex for email
		 */
		boolean result = Pattern.matches("[a][b][c][.][a-z]{1,10}[@][b][l][.][c][o][.][a-z]{1,10}",email);
		
		if(result) {
			System.out.println("This email is valid");
		}
		else {
			System.out.println("This email is not valid");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter email");
		
		String email = sc.next();
		
		toEmail(email);
	}
}
