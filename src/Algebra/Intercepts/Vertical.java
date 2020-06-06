package Algebra.Intercepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vertical extends InterceptsTemplate{
	Scanner scan = new Scanner(System.in);
	double a;
	boolean restart;
	public void printComments() {
		System.out.println("\nYou have selected form: x = a");
		restart = true;
	}
	
	public void inputData() {
		while (restart) {
			restart = false; // reset boolean
			try {
				System.out.println("\nPlease input the value of a: ");
				a = scan.nextDouble();
	
				System.out.printf("\nThe equation of the line you entered is: x = %f",a);
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input. Please provide only numbers (no text).");
				restart = true;
			}
		}
	}
	public void findIntercepts() {} // end while
	public void printResult() {
		if (a == 0)
			System.out.println("\nThe line is along the y-axis.");
		else 
			System.out.println("\nThere is no y intercept.");

		System.out.printf("The x intercept is %f", a);
	}
}
