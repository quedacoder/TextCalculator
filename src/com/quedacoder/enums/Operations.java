/**
 * 
 */
package com.quedacoder.enums;

/**
 * @author quedacoder
 * Enum of operations that can be performed
 */
public enum Operations {
	
	ADDITION("Addition"),
    SUBTRACTION("Subtraction"),
    MULTIPLICATION("Multiplication"),
    DIVISION("Division"),
    MODULO("Modulo"),
    POWER("Power"),
    ROOT("Root");
	
	private final String operationType;
	
	/**
	 * Constructor for Enum
	 * @param operationType String
	 */
	private Operations(String operationType) {
		this.operationType = operationType;
	}

	/**
	 * returns the pretty print of the enum value
	 * @return String
	 */
	public String getDisplayValue() {
		return operationType;
	}
}
