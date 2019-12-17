/**
 * 
 */
package com.quedacoder.enums;

/**
 * @author quedacoder
 *
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
	
	private Operations(String operationType) {
		this.operationType = operationType;
	}

	public String getDisplayValue() {
		return operationType;
	}

}
