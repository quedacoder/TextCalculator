/**
 * 
 */
package com.quedacoder.classes;

import com.quedacoder.interfaces.AbstractFactory;

/**
 * @author quedacoder
 * Class to provide an instance of a given factory
 */
public class FactoryProvider {
	
  /**
   * 
   * @param factory String
   * @return
   */
  public static AbstractFactory<?> getFactory(String factory) {
	  
	  if ("Operation".equalsIgnoreCase(factory)) {
		  return new OperationFactory();
	  }
	return null;
	  
  }
}
