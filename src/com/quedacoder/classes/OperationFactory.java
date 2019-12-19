/**
 * 
 */
package com.quedacoder.classes;

import com.quedacoder.interfaces.AbstractFactory;
import com.quedacoder.interfaces.IOperation;

/**
 * @author quedacoder
 * Factory class to handle the creation of Calculator operation classes
 */
public class OperationFactory implements AbstractFactory<IOperation>{

	/**
	 * Creates class instance of operation given that implements a common interface IOperation
	 * @param operationType
	 * @return IOperation
	 */
	@Override
	public IOperation create(String operationType) {
		
		IOperation opp = null;
		
		switch(operationType.toLowerCase()) {
			case "addition":
				opp = new Addition();
				break;
			case "subtraction":
				opp = new Subtraction();
				break;
			case "multiplication":
				opp = new Multiplication();
				break;
			case "modulo":
				opp = new Modulo();
				break;
			case "division":
				opp = new Division();
				break;
			case "power":
				opp = new Power();
				break;
			case "root":
				opp = new Root();
				break;
		}		
		return opp;
	}
}
