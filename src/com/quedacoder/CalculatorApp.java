package com.quedacoder;

import java.util.Scanner;

import com.quedacoder.classes.FactoryProvider;
import com.quedacoder.enums.Operations;
import com.quedacoder.exceptions.InvalidCalculatorOperation;
import com.quedacoder.interfaces.AbstractFactory;
import com.quedacoder.interfaces.IOperation;

/**
 * Main program for the Text Calculator Application Users will be able use Text
 * Calculator to perform Addition, Subtraction, Multiplication, division, Modulo
 * Division, Raise to Any Power, get Any Root
 *
 */
public class CalculatorApp {

	public static void main(String[] args) {

		// TODO: Build user welcome screen with some general instructions
		// List commands users can use exit, pi, mem, etc..
		// Display Welcome Message
		System.out.println("Welcome to the Text Calculator!!!");

		double firstNumber = 0.00;
		double secondNumber = 0.00;
		double result = 0.00;
		String operation = "";
		String userInput = "";
		boolean specialCommand = false;
		boolean error = false;
		AbstractFactory<?> operationsFactory = FactoryProvider.getFactory("Operation");
		Operations operationType = null;

		boolean quit = false;
		Scanner scanner = new Scanner(System.in);

		while (!quit) {

			error = false;
			specialCommand = false;

			// ------ New Line ------ //
			System.out.println();

			// ------ Prompt the user for input of first number ------ //
			userInput = promptUserInput(scanner, "Enter your first number (or a command) and press return:");

			// check if user wants to quit
			quit = checkUserQuit(userInput);

			// ------ Check for a special operation or calc function ------ //
			if (!quit) {

				if (userInput.equalsIgnoreCase("help")) {
					specialCommand = true;

					// ------ Read help documentation from file and output ------ //
				}

			}

			// -------- Handle users first input if not quit -------- //
			if (!quit && !specialCommand && !error) {
				try {
					firstNumber = convertInputToDouble(userInput);
				} catch (Exception e) {
					System.out.println();
					System.err.println(e.getMessage() + " is not a valid number or calc function");
					System.err.println("Please try again or type HELP for supported numbers and functions");
					error = true;
				}
			}

			// ------- Prompt the user for input of operator -------- //
			if (!quit && !specialCommand && !error) {

				// ------ Check operation entered ------ //
				try {
					operation = promptUserInput(scanner, "Enter your operator and press return:");
					quit = checkUserQuit(operation);
					operationType = checkUserOperationType(operation);
				} catch (InvalidCalculatorOperation e) {
					System.out.println();
					System.err.println("Operation " + "'" + operation + "'" + " not supported");
					System.err.println("Please try again or type HELP for supported operations");
					error = true;
				}

			}

			// ------ Prompt the user for input of second number ------ //
			if (!quit && !specialCommand && !error) {
				userInput = promptUserInput(scanner, "Enter your second number and press return:");
				quit = checkUserQuit(userInput);
			}

			// ------ Handle users second input if not quit ------ //
			if (!quit && !specialCommand && !error) {
				try {
					secondNumber = convertInputToDouble(userInput);
				} catch (Exception e) {
					System.out.println();
					System.err.println(e.getMessage() + " is not a valid number");
					System.err.println("Please try again or type HELP for supported numbers");
					error = true;
				}
			}

			// ------ Perform operation based on user input ------ //
			if (!quit && !specialCommand && !error) {

				// ------ Perform Operation ------ //
				IOperation operationChoice = operationsFactory.create(operationType.getDisplayValue());
				result = operationChoice.calculate(firstNumber, secondNumber);
				printResult(result, operation, firstNumber, secondNumber);

			}

		}

		System.out.println("Thank you for using Text Calculator.  Good-bye");

	}

	/**
	 * Helper Method - convertInputToDouble converts users input to a double data
	 * type
	 * 
	 * @param userInput String
	 * @return double
	 */
	public static double convertInputToDouble(String userInput) throws NumberFormatException {

		double convertedNumber = 0.00;

		if (userInput.equalsIgnoreCase("pi")) {
			convertedNumber = Math.PI;
		} else {
			convertedNumber = Double.parseDouble(userInput);
		}

		return convertedNumber;
	}

	/**
	 * Helper Method - checkUserOperationType validate user is only using operations
	 * that are supported by the application. Throw InvalidCalculatorOperation
	 * exception if operation entered is not supported
	 * 
	 * @param operation String
	 * @return enums
	 * @throws InvalidCalculatorOperation
	 *
	 */
	public static Operations checkUserOperationType(String operation) throws InvalidCalculatorOperation {

		Operations operationType = null;

		switch (operation) {
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
		case "R":
			operationType = Operations.ROOT;
			break;
		default:
			// throw exception operator not found
			throw new InvalidCalculatorOperation("Operation " + operation + " not supported.");
		}

		return operationType;
	}

	/**
	 * Helper Method - promptUserInput prompts the user for input
	 * 
	 * @param scanner    Scanner
	 * @param userPrompt String
	 * @return String
	 *
	 */
	public static String promptUserInput(Scanner scanner, String userPrompt) {

		System.out.println(userPrompt);
		return scanner.nextLine();

	}

	/**
	 * Helper Method - checkUserQuit gives user access to quit at any given time
	 * 
	 * @param input String
	 * @return boolean
	 *
	 */
	public static boolean checkUserQuit(String input) {

		boolean quit = false;

		if (input.equalsIgnoreCase("q")) {
			quit = true;
		}

		return quit;
	}

	/**
	 * Helper Method - printResult prints a formatted message of the user operation
	 * and result
	 * 
	 * @param result    double
	 * @param operation String
	 * @param number1   double
	 * @param nubmer2   double
	 *
	 */
	public static void printResult(double result, String operation, double number1, double number2) {

		System.out.printf("%.2f %s %.2f = %.2f", number1, operation, number2, result);
		System.out.println();

	}

}
