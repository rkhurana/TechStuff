package com.self.pms.common.util;


import org.junit.Test;


/**
 * This is a test class to test all the methods available in {@link StringUtils} class.
 * 
 * @author Rohit Khurana
 *
 */
public class TestStringUtils {

	//@Test
	public void testIsEmpty() {
	}

	/**
	 * Test method to test isEqual() method
	 * In this, we have passed two strings and checking it whether they are equal or not.
	 */
	@Test
	public void testIsEqual() {
		String str1 = "Welcome";
		String str2 = "Welcome";
		boolean isEqual = new StringUtils().isEqual(str1, str2);
		System.out.println("The result is: "+ isEqual);
	}

}
