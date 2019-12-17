package com.quedacoder.classes;

import com.quedacoder.interfaces.IOperation;

public class Power implements IOperation {

	@Override
	public double calculate(double firstNumber, double secondNumber) {
		return Math.pow(firstNumber, secondNumber);
	}

}
