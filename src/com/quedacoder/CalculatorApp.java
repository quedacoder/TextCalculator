package com.quedacoder;

import java.util.Scanner;

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
		
		
		boolean quit = false;
		Scanner scanner = new Scanner(System.in);
		
		while (!quit) {
			
			//------ New Line ------//
			System.out.println();
			
			//------ Prompt the user for input of first number
			userInput = promptUserInput(scanner, "Enter your first number (or a command) and press return:");
			
			// check if user wants to quit 
			quit = checkUserQuit(userInput);
			
			//-------- Handle users first input if not quit --------//
			if (!quit) {
				firstNumber = Double.parseDouble(userInput);
			}
				
			
			//------- Prompt the user for input of operator --------//
			if (!quit) {
				userInput = promptUserInput(scanner, "Enter your operator and press return:");
				quit = checkUserQuit(userInput);
			}
			
			if (!quit) {
				userInput = promptUserInput(scanner, "Enter your second number and press return:");
				quit = checkUserQuit(userInput);
			}
				
			//------ Handle users second input if not quit ------//
			if (!quit) {
				secondNumber = Double.parseDouble(userInput);
			}
			    
			//------ Perform operation based on user input ------//
			if (!quit) {
				
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
	
	

}
