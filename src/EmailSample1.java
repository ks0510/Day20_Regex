/*
 * This java program validate email samples with regex.
 */
package com.demo;

import java.util.regex.Pattern;
import java.util.*;

/**
 * 
 * @author Kaif
 *
 */
public class EmailSample1 {

	/*
	 * To define method which check email is valid or not
	 */
	public static boolean checkEmail(String emailId) {

		/*
		 * Setting regex pattern given in UC
		 */
		return Pattern.matches("[a][b][c][a-zA-Z0-9@+_-]{1,}[a-z]{1,}[.]{1}[a-z]{1,}", emailId);

	}

	/**
	 * This is main mehtod of program
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter email");

		String email = sc.next();
		
		/*
		 *To call out method
		 */
		System.out.println(checkEmail(email));

	}
}
