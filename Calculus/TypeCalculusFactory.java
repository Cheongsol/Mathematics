package Calculus;

public class TypeCalculusFactory extends CalculusFactory{

	@Override
	public Calculus createCalculus(String type) {
		Calculus calculus = null;
		
		switch(type){
			case("BinaryToDecimalConversion"):
				calculus = new BinaryToDecimalConversion();
			case("BinaryToHexadecimalConversion"):
				calculus = new BinaryToHexadecimalConversion();
			case("DecimalToBinaryConversion"):
				calculus = new DecimalToBinaryConversion();
			case("Gamma"):
				calculus = new Gamma();
		}
		return calculus;
	}
	
}
