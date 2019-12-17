/**
 * 
 */
package com.quedacoder.classes;

import com.quedacoder.interfaces.AbstractFactory;
import com.quedacoder.interfaces.IOperation;

/**
 * @author quedacoder
 *
 */
public class OperationFactory implements AbstractFactory<IOperation>{

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
			default:
				// throws exception
				break;
		}		
		return opp;
	}
}
