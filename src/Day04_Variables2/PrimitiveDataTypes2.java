package Day04_Variables2;

	/*
	 Primitives data type - byte, short, int, long, float, double, boolean, char
	 	
	 		boolean = false or true
	 		boolean = takes all boolean expression and returns eithr true/false.
	 		
	 		ASCI table is universal system that is recognized by all computers. Each characters have corresponding number to represent it.
	 		
	 		char = declared within the single quote '' and single character only.  
	 */
	
	
public class PrimitiveDataTypes2 {

		public static void main(String[] args) {
			
			//  Working with boolean Variables.  
			
			boolean result = true;
			boolean result2 = false;
			boolean result3 = 9 > 3;
			boolean result4 = 3 < 9;
			boolean result5 = 3 > 9;
			boolean result6 = 9 < 3;
			
			System.out.println(result);  //printed single line true
			System.out.println(result2); //printed single line false 
			System.out.println(result3); //printed single line true
			System.out.println(result4); //printed single line true
			System.out.println(result5); //printed single line false
			System.out.println(result6); //printed single line false
			
			//  Working with char Variables.
			
			char char1= 'a';           //printed letter a as quoted
			char char2= 'b';          // printed letter b as quoted
			char char3= 65;           // prined Capital A as correspond to 65 in ASCI table. Also no single quoted needed
			char char4= 123;
								
			System.out.println(char1);
			System.out.println(char2);
			System.out.println(char3);
			System.out.println(char4);
			
			//   Initiallizing char with other variables
			
			
			
		
		
		}
}
