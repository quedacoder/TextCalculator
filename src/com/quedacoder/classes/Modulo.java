/**
 * 
 */
package com.quedacoder.classes;

import com.quedacoder.interfaces.IOperation;

/**
 * @author quedacoder
 *
 */
public class Modulo implements IOperation {

	@Override
	public double calculate(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber % secondNumber;
	}

}
