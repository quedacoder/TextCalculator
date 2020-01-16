package com.quedacoder.classes;

import com.quedacoder.interfaces.IOperationable;

/**
 * @author quedacoder Class to calculate the root of any number
 */
public class Root implements IOperationable {

	/**
	 * calculate method - implements IOperationable interfaces and performs root of a
	 * given number
	 * 
	 * @param ninthNumber  double
	 * @param baseNumber double
	 * @return double
	 */
	@Override
	public double calculate(double ninthNumber, double baseNumber) {

		// ------ check for negative numbers and flip sign ------ //
		if (ninthNumber < 0) {
			ninthNumber = Math.abs(ninthNumber);
		}

		if (baseNumber < 0) {
			baseNumber = Math.abs(baseNumber);
		}
		
		if (ninthNumber == 0) {
			return 0;
		}

		double conversion = .0001;
		double x1 = ninthNumber;
		double x2 = ninthNumber / baseNumber;


		// ------ perform calculation ------ //
		while(Math.abs(x1 - x2) > conversion) {
			x1 = x2; 
			
			x2 = ((ninthNumber - 1.0) * x2 + baseNumber / Math.pow(x2,  ninthNumber - 1.0)) / ninthNumber; 
		}

		return x2;
	}

}
