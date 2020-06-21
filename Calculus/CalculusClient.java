package Calculus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculusClient {
	private TypeCalculusFactory typeCalculusFactory;
	public void main() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Calculus calculus = typeCalculusFactory.createCalculus(input);
		try{
			calculus.calculus();
		}
		catch(InputMismatchException ex){
			calculus.error();
		}
		sc.close();
	}
}
