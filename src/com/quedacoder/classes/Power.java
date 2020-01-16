package com.quedacoder.classes;

import com.quedacoder.interfaces.IOperationable;

/**
 * @author quedacoder
 * Class to raise a given number to any power
 */
public class Power implements IOperationable {

	/**
	 * calculate method - implements IOperationable interfaces and performs
	 * power of a given number
	 * @param firstNumber double
	 * @param secondNumber double
	 * @return double
	 */
	@Override
	public double calculate(double firstNumber, double secondNumber) {
		return Math.pow(firstNumber, secondNumber);
	}

}
