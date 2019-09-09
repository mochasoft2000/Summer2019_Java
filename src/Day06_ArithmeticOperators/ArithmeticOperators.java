package Day06_ArithmeticOperators;

public class ArithmeticOperators {

	/*
	 +: addition
	 -; subtrac
	 *= multiplication
	 / division
	  % remainder
	   
	
	 */
	
	public static void main(String[] args) {
		
		int a= 100;
		int b= a-400; //-300
		
		System.out.println(b);
		
		int c = a+b;
		System.out.println(c); //-200  basically 100 + (-300)
		
		short sNum1 = 10/3; //although it's 3.3333 etc.  but the print out is only 3 because it's a short
		
		double dNum = 10/3; // the result is 3.0 because double is a double gives decimal
		
		int result = 10%3;
		System.out.println(result);
	}
	
	
	
	
	
}
