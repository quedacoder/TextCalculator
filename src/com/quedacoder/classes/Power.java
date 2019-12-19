package com.quedacoder.classes;

import com.quedacoder.interfaces.IOperation;

/**
 * @author quedacoder
 * Class to raise a given number to any power
 */
public class Power implements IOperation {

	/**
	 * calculate method - implements IOperation interfaces and performs
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
