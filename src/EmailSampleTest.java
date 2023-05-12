/*
 * This java program create junit test for email validation
 */
package com.demo;
/*
 * To import package for junit case
 */


import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


/**
 * 
 * @author Kaif
 *
 */

public class EmailSampleTest {
	
	/*
	 * To create EmailSample object
	 */
	//@Parameters.Parameter
	EmailSample1 email = new EmailSample1();
	
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
	   * Happy test case for emailId with paramiterized method
	   */
	 @ParameterizedTest
	 @ValueSource(strings = {"abc-100@yahoo.com"})
	 public void tocheckEmail(String inputText) {
		 
		 Assertions.assertTrue(email.checkEmail(inputText));
	 }
	 
	  /*
	   * Sad test case for emailId with paramiterized method
	   */
	 
	 
	 @ParameterizedTest
	 @ValueSource(strings = {".abc@abc.com"})
	 public void tocheckEmail1(String inputText) {
		 Assertions.assertFalse(email.checkEmail(inputText));
     }
}
