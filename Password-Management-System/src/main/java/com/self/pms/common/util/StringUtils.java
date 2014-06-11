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
}
