package Algebra.Intercepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pointSlopeForm extends InterceptsTemplate {
	Scanner scan = new Scanner(System.in);
	boolean restart;
	double slope;
	double x0, y0;
	double xIntercept, yIntercept;
	/**
	 * Calculates the intercepts of a line in point-slope form
	 */
	public void printComments() {
		System.out.println("\nYou have selected form: y - y0 = m(x - x0)"
						 + "\nFor this form you need a point (x0, y0).");

		restart = true;
	}
	
	public void inputData() {
		while (restart) {
			restart = false; // reset boolean
			try {
				System.out.println("\nPlease input the slope of the line (m): ");
				slope = scan.nextDouble();
				if (slope == 0.0) throw new ZeroSlopeException();

				System.out.println("Plase input the value of x0: ");
				x0 = scan.nextDouble();

				System.out.println("Plase input the value of y0: ");
				y0 = scan.nextDouble();
			}
			catch(ZeroSlopeException e) {
				restart = zeroSlopeHandler();
				if (!restart) new Horizontal().doAll(); // user chose to calculate the slope of a horizontal line
				
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input. Please provide only numbers (no text).");
				restart = true;
			}

		} // end while
	}
	
	public void findIntercepts() {
		System.out.printf("\nThe equation of the line you entered is: y - %f = %f(x - %f)",y0,slope,x0);
		yIntercept = -1 * ((slope * x0) - y0);
		xIntercept = xIntercept(slope, yIntercept);
	}
	
	public void printResult() {
		System.out.printf("\n\nThe y intercept is %f", yIntercept);
		System.out.printf("\nThe x intercept is %f", xIntercept);
	}
}
