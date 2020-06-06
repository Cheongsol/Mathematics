package Algebra.Intercepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class InterceptsTemplate {
	protected static Scanner scan;
	
	abstract void printComments();
	
	abstract void inputData();
	
	abstract void findIntercepts();
	
	abstract void printResult();
	
	void doAll() {
		printComments();
		inputData();
		findIntercepts();
		printResult();
	}
	/**
	 * Calculates the y intercept of a horizontal line.
	 */
	

	/**
	 * Calculates the x intercept of a vertical line.
	 */
	

	/**
	 * Used to calculate x intercept of slope-intercept and point-slope forms.
	 * @param slope of the line
	 * @param b the y intercept of the line
	 * @return the x intercept of the line
	 */
	protected static double xIntercept(double slope, double b) {
		if (b != 0) {
			return (-1 * b) / slope;
		}
		else {
			return b / slope;
		}
	}
	
	/**
	 * Asks users who input a slope of 0 in sloptInterceptForm() or pointSlopeForm() if they 
	 * want to calculate the intercepts of a horizontal line.
	 * @return false if should calculate slope of horizontal line; true if should keep using calling the form
	 */
	protected static boolean zeroSlopeHandler() {
		boolean invalidInput = true;
		do {
			invalidInput = false;
			System.out.println("Would you like to calculate the slope of a horizontal line? (y/n): ");
			char toRestart = scan.next().charAt(0);
			if (toRestart == 'n' || toRestart == 'N') {
				return true;
			}
			else if(toRestart == 'y' || toRestart == 'Y') {
				return false;
			}
			else {
				invalidInput = true;
			}
			
		} while(invalidInput);
		return false; // default return value
	}
}
