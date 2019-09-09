package Day14_Scanner;

import java.util.Scanner;  

public class ScannerClass {

	/*
	 * Scanner is a class that provides the methods to get user inputs
	 * Scanner class comes from package "java.util" package
	 * in order to use scanner class, the scanner class must be imported to your class
	 * so type import java.util.Scanner;
	 * the import statement MUST be placed between package and class name
	 * Declaration of Scanner:
	 * 	Scanner VariableName = new Scanner(System.in);
	 * 			VariableName can reference an object of the scanner class.
	 * 
	 * Methods of scanner class:
	 * 		VariableName.nextByte():
	 * 			this allows user to enter Byte value
	 */
	
		public static void main(String[] args) {
			
			Scanner scanInput = new Scanner(System.in);
			System.out.println("Enter a Byte Value");
				byte byteNum = scanInput.nextByte();
				System.out.println("You have entered:" + byteNum);
				
			System.out.println("Enter another Byte value");
				byte byteNum2 = scanInput.nextByte();
				System.out.println("Your second input is:" + byteNum2);
				
		}
	
	
}
