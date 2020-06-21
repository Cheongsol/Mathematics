package Calculus.Limits;

import java.util.Scanner;

public class LimitOfAPolynomial{
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.println("Find limit as x approaches: \n1) A number \n2) Infinity");
			String select = sc.nextLine();
			
			if (select.equalsIgnoreCase("1")) {
				System.out.println("Please enter your numbers (ax^2 + bx + c) as: a,b,c,x (separate each value with commas, no spaces)");
				String input = sc.nextLine();
				LimitAtPoint(input);
				
			} else if (select.equalsIgnoreCase("2")) {
				try {
			          System.out.println("Please enter your numbers (ax^2 + bx + c) as: a,b,c  ");
			          
			          String input = sc.nextLine();
			          LimitAtInfinity(input);
			     } catch (Exception e) {
			          System.out.println("Please use the proper format");
			     }
			}
			
		} catch (Exception e) {
    	  formatError();
		}
	}

	private static void formatError() {
		System.out.println("Please use the proper format... Try again!");
    	System.out.println();
    	String[] a = new String[5];
    	main(a);
	}

	private static void LimitAtPoint(String input) {
		String[] split = input.split(",");
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		int c = Integer.parseInt(split[2]);
		int x = Integer.parseInt(split[3]);
	
		int limitAsXApproachesNumber = getLimitApproachesNumber(a, b, c, x);
		System.out.println("The limit is: " + limitAsXApproachesNumber);
	}

	private static int getLimitApproachesNumber(int a, int b, int c, int x) {
		return ((a * (x * x)) + (b * x)) + c;
	}
	
	private static void LimitAtInfinity(String input) {
		String[] split = input.split(",");
	    int a = Integer.parseInt(split[0]);
	    int b = Integer.parseInt(split[1]);
	    int c = Integer.parseInt(split[2]);
	
	    getLimit(a, b, c);
	}

	private static void getLimit(int a, int b, int c) {
		if (a == 0 && b == 0) {
		      System.out.println("The limit is: " + c + " at both +�닞 and -�닞");
		  } else if (a == 0) {
		      if (b > 0) {
		          System.out.println("There is no limit, as x approaches +�닞 the answer is: +�닞 , as x approaches -�닞 the answer is: -�닞 ");
		      } else {
		          System.out.println("There is no limit, as x approaches +�닞 the answer is: -�닞 , as x approaches -�닞 the answer is: +�닞 ");
		      }
		  } else if (a > 0) {
		      System.out.println("There is no limit, as x approaches +�닞 the answer is: +�닞 , as x approaches -�닞 the answer is: -�닞 ");

		  } else {
		      System.out.println("There is no limit, as x approaches +�닞 the answer is: -�닞 , as x approaches -�닞 the answer is: +�닞 ");
		  }
	}
}
