
package com.quedacoder.exceptions;

/**
 * @author quedacoder
 * Custom exception class that allows for custom exceptions to be thrown
 */
public class InvalidCalculatorOperation extends Exception {
	
	/**
	 * 
	 * @param exceptionMessage String
	 */
	public InvalidCalculatorOperation(String exceptionMessage) {
		super(exceptionMessage);
	}

}
