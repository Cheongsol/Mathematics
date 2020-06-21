package Calculus;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class DecimalToBinaryConversion implements Calculus {
	
    private ArrayList<Integer> decimalToBinary(int decimal){
        ArrayList<Integer> binary =new ArrayList<>();
        while(decimal>0){
            binary.add(0,decimal%2);
            decimal/=2;            
        }
        return binary;
    }
    
    public void printBinary(ArrayList<Integer> binary){
        for(int i:binary)
            System.out.print(i);
        System.out.println("");
    }

	@Override
	public void calculus() {
		Scanner scan = new Scanner (System.in);
	    
	    System.out.println("Please input a decimal number to convert...");
	    int numToConvert = scan.nextInt();
	    ArrayList <Integer> convertedNum = decimalToBinary(numToConvert);
	    System.out.print("Decimal number: "+numToConvert + " is equal to binary number: ");
	    printBinary(convertedNum);
	    scan.close();
	}

	@Override
	public void error() {
		System.err.println("Please provide only numbers (no text). Restart the program and try again!");
	}
}