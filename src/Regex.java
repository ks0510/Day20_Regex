/*
 * This java program creates diffrent methods for validate first name, last name,email and phone number
 * and password form user input 
 */
package com.bridgelabz2;

import java.util.regex.Pattern;
/**
 * 
 * @author Kaif
 *
 */

/*
 * This is main class of program
 */
public class Regex {
	
	/*
	 * Method to check first name valid or not by regex pattern
	 */
	public boolean tofirstName(String firstName) {
		return Pattern.matches("\\p{Upper}(\\p{Lower}+\\s?){2}",firstName);
	}
	
	/*
	 * Method to check last name valid or not by regex pattern
	 */
	public boolean tolastName(String lastName) {
		return Pattern.matches("\\p{Upper}(\\p{Lower}+\\s?){2}",lastName);
	}
	
	/*
	 * Method to check phone number valid or not by regex pattern
	 */
	public boolean tophoneNumber(String phoneNumber) {
		return Pattern.matches("[1-9]{1}[0-9]{1}[6-9]{1}[0-9]{9}",phoneNumber);
	}
	
	/*
	 * Method to check email valid or not by regex pattern
	 */
	public boolean toEmail(String email) {
		return Pattern.matches("[a][b][c][.][a-z]{1,10}[@][b][l][.][c][o][.][a-z]{1,10}",email);
	}
	
	/*
	 * Method to check email valid or not by regex pattern
	 */
	public boolean toPassword(String password) {
		 return Pattern.matches("[A-Z]{1,}[a-zA-Z0-9!@#$%^&*]{1,}",password);
	}
}
