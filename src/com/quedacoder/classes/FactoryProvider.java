/**
 * 
 */
package com.quedacoder.classes;

import com.quedacoder.interfaces.AbstractFactory;

/**
 * @author quedacoder
 *
 */
public class FactoryProvider {
  public static AbstractFactory<?> getFactory(String factory) {
	  
	  if ("Operation".equalsIgnoreCase(factory)) {
		  return new OperationFactory();
	  }
	return null;
	  
  }
}
