package Algebra.Intercepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class slopeInterceptForm extends InterceptsTemplate {
	Scanner scan = new Scanner(System.in);
	boolean restart;
	double slope;
	double b;
	double xIntercept;
	/**
	 * Calculates the x intercept of a line in slope-intercept form.
	 */
	public void printComments() {
		System.out.println("\nYou have selected form: y = m*x + b");
		restart = true;
	}
	
	public void inputData() {
		while (restart) {
			restart = false; // reset boolean
			try {
				System.out.println("\nPlease input the slope of the line (m): ");
				slope = scan.nextDouble();
				if (slope == 0.0) throw new ZeroSlopeException();

				System.out.println("Plase input the value of b: ");
				b = scan.nextDouble();
			}
			catch(ZeroSlopeException e) {
				restart = zeroSlopeHandler();
				if (!restart) new Horizontal().doAll();; // user chose to calculate the slope of a horizontal line
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input. Please provide only numbers (no text).");
				restart = true;
			}
		} // end while
	}
	public void findIntercepts() {
		xIntercept = xIntercept(slope, b);
	}
	public void printResult() {
		System.out.printf("\nThe equation of the line you entered is: y = %f*x + %f",slope,b);
		System.out.printf("\n\nThe y intercept is %f", b);
		System.out.printf("\nThe x intercept is %f", xIntercept);
	}

}
