/*
 * This java program check valid phone number using regex.
 */
package regexnew;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 
 * @author Kaif
 *
 */

public class PhoneNumber {
	
	/*
	 * To define validate phone number by regex
	 */
	public static void tophoneNumber(String phoneNumber) {
		
		/*
		 * To define regex pattern
		 */
		Pattern pattern = Pattern.compile("^[1-9]{1}[0-9]{1} [6-9]{1}[0-9]{9}$");
	    Matcher matcher = pattern.matcher(phoneNumber);
	    boolean isValid = matcher.matches();
	    
	    if (isValid) {
            System.out.println("Phone Number is valid");
        } else {
            System.out.println("Phone Number is invalid");
        }
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter phone number");
		
		String phoneNumber = sc.nextLine().trim();
		
		/*
		 * To call method
		 */
		tophoneNumber(phoneNumber);
	}
}
