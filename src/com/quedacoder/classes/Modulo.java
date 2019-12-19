/**
 * 
 */
package com.quedacoder.classes;

import com.quedacoder.interfaces.IOperation;

/**
 * @author quedacoder
 * Class to perform modulo on two given numbers
 */
public class Modulo implements IOperation {

	/**
	 * calculate method - implements IOperation interfaces and performs
	 * modulo of two number of type double
	 * @param firstNumber double
	 * @param secondNumber double
	 * @return double
	 */
	@Override
	public double calculate(double firstNumber, double secondNumber) {
		return firstNumber % secondNumber;
	}

}
