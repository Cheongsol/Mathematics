package Calculus;

import java.util.*;

public class BinaryToDecimalConversion implements Calculus{
	
	protected boolean binaryIsValid(String binary){
        boolean binaryIsValid = binary.matches("[01]+") && !binary.startsWith("0");
		if (binaryIsValid) {
            return true;
        }
        else{
            return false;
        }
    }
	
    private int binaryToDecimalConversion(int binary){
        int decimal=0,digit=1;
        while(binary>0){
            decimal+=digit*(binary%10);
            binary/=10;
            digit*=2;
        }
        
        return decimal;
    }


    public void error() {
		System.err.println("Please provide only numbers (no text). Restart the program and try again!");
	}

	public void calculus() {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please input a binary number to convert...");
		String binary = scan.nextLine();
		int convertedNum;
		if (binaryIsValid(binary)){
			int numToConvert = Integer.parseInt(binary);
			convertedNum=binaryToDecimalConversion(numToConvert);
			System.out.println("Binary number: "+binary + " is equal to decimal number: "+ convertedNum );
        }
	}   

}
 