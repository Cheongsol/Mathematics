package Algebra.Intercepts;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Calculate the x and y intercepts of the equation of a line in one of four forms:
 * slope-intercept, point-slope, horizontal, or vertical.
 */
public class InterceptsOfALine {
	static int userChoice;
	private static Scanner scan;

	public static void main(String[] args) {
		new InterceptsOfALine().prepare();
		InterceptsTemplate choice = null;
		switch(userChoice) {
		case 1: choice = new slopeInterceptForm();break;
		case 2: choice = new pointSlopeForm(); break;
		case 3: choice = new Horizontal(); break;
		case 4: choice = new Vertical(); break;
		default: System.out.println("Invalid Choice.\nExiting");
		/*
		case 1: slopeInterceptForm slope = new slopeInterceptForm();
				slope.slopeInterceptForm(); break;
		case 2: pointSlopeForm point = new pointSlopeForm();
				point.pointSlopeForm(); break;
		case 3: InterceptsTemplate.horizontal(); break;
		case 4: InterceptsTemplate.vertical(); break;
		default: System.out.println("Invalid Choice.\nExiting");
		*/
		}
		choice.doAll();
	}

	public void prepare() {
		System.out.println("Welcome to the intercepts of a line calculator!");

		System.out.println("Inputs to this program can be whole numbers or decimal numbers.");
		// all inputs (other than to select equations) read as doubles

		System.out.print("\nWhich equation of a line would you like to use?"
				+ "\n1: y = m*x + b"
				+ "\n2: y - y0 = m(x - x0)"
				+ "\n3: y = b  (horizontal line)"
				+ "\n4: x = a  (vertical line)"
				+ "\n --> ");

		scan = new Scanner(System.in);
		userChoice = scan.nextInt();
	}

}
