package Algebra.Intercepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Horizontal extends InterceptsTemplate {
	Scanner scan = new Scanner(System.in);
	double b;
	boolean restart;
	public void printComments() {
		System.out.println("\nYou have selected form: y = b");
		restart = true;
	}
	public void inputData() {
		while (restart) {
			restart = false; // reset boolean
			try {
				System.out.println("\nPlease input the value of b: ");
				b = scan.nextDouble();
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input. Please provide only numbers (no text).");
				restart = true;
			}

		} // end while
	}
	public void findIntercepts() {
		
	}
	public void printResult() {
		System.out.printf("\nThe equation of the line you entered is: y = %f",b);

		System.out.printf("\n\nThe y intercept is %f\n", b);

		if (b == 0)
			System.out.println("The line is along the x-axis.");
		else 
			System.out.println("There is no x intercept.");
	}
}
