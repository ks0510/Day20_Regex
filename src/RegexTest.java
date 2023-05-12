/*
 * This java program create junit test methods to check methods are working or not
 */
package com.bridgelabz2;

/*
 * To import packages for junit
 */
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * This is main class of program
 */
public class RegexTest {
	
	/*
	 * To create Regex object
	 */
	Regex regex = new Regex();
	
	/*
	 * Before method which execute before test case
	 */
	   @Before
	    public void before() {
	        System.out.println("I am running before");
	    }
	  
	    /*
		 * After method which execute after test case
		 */
	  @After
	    public void after() {
	        System.out.println("I am running after");
	    }
	  
	  /*
	   * Happy test case for firstName method
	   */
	 @Test
	 public void istofirstName() {
		  boolean actualOutput = regex.tofirstName("Kaif");
	      assertTrue(actualOutput);
	 }
	 
	  /*
	   * Sad test case for firstName method
	   */
	 @Test
	 public void istofirstName1() {
		  boolean actualOutput = regex.tofirstName("kaif");
	      assertFalse(actualOutput);
	 }
	 
	  /*
	   * Happy test case for lastName method
	   */
	 
	 @Test
	 public void istolastName() {
		  boolean actualOutput = regex.tolastName("Shaikh");
	      assertTrue(actualOutput);
	 }
	 
	  /*
	   * Sad test case for lastName method
	   */
	 
	 @Test
	 public void istolastName1() {
		  boolean actualOutput = regex.tolastName("shaikh");
	      assertFalse(actualOutput);
	 }
	 
	  /*
	   * Happy test case for Email method
	   */
	 @Test
	 public void istoEmail() {
		  boolean actualOutput = regex.toEmail("abc.xyz@bl.co.in");
	      assertTrue(actualOutput);
	 }
	 
	  /*
	   * Sad test case for Email method
	   */
	 @Test
	 public void istoEmail1() {
		  boolean actualOutput = regex.toEmail("pqr.xyz@bl.co.in");
	      assertFalse(actualOutput);
	 }
	 
	  /*
	   * Happy test case for phoneNumber method
	   */ 
	 @Test
	 public void istophoneNumber() {
		  boolean actualOutput = regex.tophoneNumber("918149977825");
	      assertTrue(actualOutput);
	 }
	 
	  /*
	   * Sad test case for phoneNumber method
	   */
	 @Test
	 public void istophoneNumber1() {
		  boolean actualOutput = regex.tophoneNumber("012149977825");
	      assertFalse(actualOutput);
	 }
	 
	  /*
	   * Happy test case for password method
	   */
	
	 @Test
	 public void istoPassword() {
		boolean actualOutput = regex.toPassword("Solapur@123"); 
		 assertTrue(actualOutput);
	}
	 
	  /*
	   * Sad test case for Password method
	   */

	 @Test
	 public void istoPassword1() {
		boolean actualOutput = regex.toPassword("solapur@123"); 
		 assertFalse(actualOutput);
	}
}
