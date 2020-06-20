package Calculus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculusClient {
	private Calculus calculus;
	
	public void main() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Calculus calculus = CalculusFactory.createCalculus(input);
		try{
			calculus.calculus();
		}
		catch(InputMismatchException ex){
			calculus.error();
		}
		sc.close();
	}
}
