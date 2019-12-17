package com.quedacoder;

import java.util.Scanner;

import com.quedacoder.classes.FactoryProvider;
import com.quedacoder.enums.Operations;
import com.quedacoder.interfaces.AbstractFactory;
import com.quedacoder.interfaces.IOperation;

/**
 * Main program for the Text Calculator Application
 * Users will be able use Text Calculator to perform
 * Addition, Subtraction, Multiplication, division,
 * Modulo Division, Raise to Any Power, get Any Root
 *
 */
public class CalculatorApp {

	public static void main(String[] args) {
		
		
		//TODO: Build user welcome screen with some general instructions
		//      List commands users can use exit, pi, mem, etc..
		//Display Welcome Message
		System.out.println("Welcome to the Text Calculator!!!");
		
		double firstNumber = 0.00;
		double secondNumber = 0.00;
		double result = 0.00;
		String operation = "";
		String userInput = "";
		boolean specialCommand = false;
		AbstractFactory<?> operationsFactory = FactoryProvider.getFactory("Operation");
		
		
		boolean quit = false;
		Scanner scanner = new Scanner(System.in);
		
		while (!quit) {
			
			//------ New Line ------//
			System.out.println();
			
			//------ Prompt the user for input of first number ------//
			userInput = promptUserInput(scanner, "Enter your first number (or a command) and press return:");
			
			// check if user wants to quit 
			quit = checkUserQuit(userInput);
			
			//------ Check for a special operation or calc function ------//
			if (!quit) {
				
			}
			
			//-------- Handle users first input if not quit --------//
			if (!quit && !specialCommand) {
				firstNumber = Double.parseDouble(userInput);
			}
				
			
			//------- Prompt the user for input of operator --------//
			if (!quit  && !specialCommand) {
				operation = promptUserInput(scanner, "Enter your operator and press return:");
				quit = checkUserQuit(operation);
			}
			
			//------ Prompt the user for input of second number ------//
			if (!quit  && !specialCommand) {
				userInput = promptUserInput(scanner, "Enter your second number and press return:");
				quit = checkUserQuit(userInput);
			}
				
			//------ Handle users second input if not quit ------//
			if (!quit  && !specialCommand) {
				secondNumber = Double.parseDouble(userInput);
			}
			    
			//------ Perform operation based on user input ------//
			if (!quit  && !specialCommand) {
				
				Operations operationType = null;

				switch(operation) {
					case "+":
						operationType = Operations.ADDITION;
						break;
					case "-":
						operationType = Operations.SUBTRACTION;
						break;
					case "*":
						operationType = Operations.MULTIPLICATION;
						break;
					case "%":
						operationType = Operations.MODULO;
						break;
					case "/":
						operationType = Operations.DIVISION;
						break;
					case "^":
						operationType = Operations.POWER;
						break;
					case "":
						operationType = Operations.ROOT;
						break;
					default:
						// throw exception operator not found
						break;
				}
				
				//------ Perform Operation ------//
				IOperation operationChoice = operationsFactory.create(operationType.getDisplayValue());
			    result = operationChoice.calculate(firstNumber, secondNumber);
			    printResult(result, operation, firstNumber, secondNumber);
			    
			    
			}
			 
		}
		
		System.out.println("Thank you for using Text Calculator.  Good-bye");

	}
	
	public static String promptUserInput(Scanner scanner, String userPrompt) {
		
		System.out.println(userPrompt);
		return scanner.nextLine();
		
	}
	
	public static boolean checkUserQuit(String input) {
		
		boolean quit = false;
		
		if (input.equalsIgnoreCase("q")) {
			quit = true;
		}
		
		return quit;
	}
	
	public static void printResult(double result, String operation, double number1, double number2) {
		
		System.out.printf("%.2f %s %.2f = %.2f", number1, operation, number2, result);
		System.out.println();
		
	}

}
