/**
 * 
 */
package com.quedacoder.classes;

import com.quedacoder.interfaces.IOperation;

/**
 * @author quedacoder
 *
 */
public class Addition implements IOperation {

	@Override
	public double calculate(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

}
