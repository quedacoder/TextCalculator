/**
 * 
 */
package com.quedacoder.classes;

import com.quedacoder.interfaces.IOperationable;

/**
 * @author quedacoder
 * Class to perform multiplication on two given numbers
 */
public class Multiplication implements IOperationable {

	/**
	 * calculate method - implements IOperationable interfaces and performs
	 * multiplication of two number of type double
	 * @param firstNumber double
	 * @param secondNumber double
	 * @return double
	 */
	@Override
	public double calculate(double firstNumber, double secondNumber) {
		
		return firstNumber * secondNumber;
	}

}
