/*
 * This java program create custom exception for regex pattern
 */
package regexexception;
/**
 * 
 * @author Kaif
 *
 */

public class InvalidUserDetailsException extends Exception {

	String Message;

	public InvalidUserDetailsException(String message) {
		super(message);
	}
	
}
