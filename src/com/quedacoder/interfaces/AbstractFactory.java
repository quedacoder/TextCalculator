package com.quedacoder.interfaces;

public interface AbstractFactory<T> {
	
	IOperation create(String operationType);
	
}
