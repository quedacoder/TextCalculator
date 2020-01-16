package com.quedacoder.interfaces;

/**
 * 
 * @author quedacoder
 * Interfacce that excepts generic type
 * @param <T>
 */
public interface AbstractFactory<T> {
	
	/**
	 * Creates instance of type
	 * @param operationType String
	 * @return IOperationable
	 */
	IOperationable create(String operationType);
	
}
