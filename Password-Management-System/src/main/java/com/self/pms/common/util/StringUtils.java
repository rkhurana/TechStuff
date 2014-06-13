/**
 * 
 */
package com.self.pms.common.util;

/**
 * This is a class which contains all the string utilities methods.
 * 
 * @author Rohit Khurana
 *
 */
public class StringUtils {

	/**
	 * This method checks whether the specified string is empty or not.
	 * 
	 * @param str
	 * @return true if empty otherwise false
	 */
	public boolean isEmpty(String str){
		boolean isEmpty = false;
		// Checking whether string is empty or not
		if(str != null && str.length() > 0){
			isEmpty = true;
		}
		
		return isEmpty;
	}
	
	/**
	 * This method checks whether two strings are equal or not.
	 * 
	 * @param str1
	 * @param str2
	 * @return true if equal otherwise false
	 */
	public boolean isEqual(String str1, String str2){
		boolean isEqual = false;
			// Checks if two strings are equal
			if(str1.equals(str2)){
				isEqual = true;
		}
		return isEqual;
	}
	
}
