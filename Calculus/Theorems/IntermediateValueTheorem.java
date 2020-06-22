package Calculus.Theorems;

import java.util.Scanner;

public class IntermediateValueTheorem {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Welcome to the Intermediate Value Theorem Calculator!");

	    System.out.println("Is the function continuous? Yes or no?");
	    String isContinuous = sc.nextLine();
	    
	    intermediatedValueCalculator(isContinuous);
	}

	private static void intermediatedValueCalculator(String isContinuous) {
		boolean continuous = isContinuous.equalsIgnoreCase("yes");
		if(!continuous){
			notContinuous();
	    }
	
		double min = getMin();
		
		double max = getMax();
		
		double value = getValue();
		
		System.out.println("Calculating...");
			
		getIsIntermediateValue(min, max, value);
	}

	private static void notContinuous() {
		System.out.println("Since your function is not continuous, Intermediate Value Theorem does NOT apply...");
	}

	private static void getIsIntermediateValue(double min, double max, double value) {
		if(isIntermediateValue(min, max, value)){
			System.out.println("Yes! The function DOES pass through the given value based on the Intermediate Value Therorem!");
		}else{
			System.out.println("Sorry. The function may NOT pass through the value based on the Intermediate Value Theorem...");
		}
	}

	private static double getValue() {
		System.out.println("Enter in a number to be tested with IVT (check whether or not the function could pass through this value based on Intermediate Value Theorem...");
		double value = sc.nextDouble();
		return value;
	}

	private static double getMax() {
		System.out.println("What is the maximum value of your function?");
		double max = sc.nextDouble();
		return max;
	}

	private static double getMin() {
		System.out.println("What is the minimum value of your function?");
		double min = sc.nextDouble();
		return min;
	}

	private static boolean isIntermediateValue(double min, double max, double value) {
		return (min < value) && (max > value);
	}
}