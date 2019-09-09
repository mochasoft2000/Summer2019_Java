package Day15_Scanner_StringClass;

import java.util.*;

public class Task03 {

		public static void main (String[]  args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter num1");
				double input1 = input.nextDouble();
			System.out.println("Enter num2");
				double input2 = input.nextDouble();
			System.out.println("Enter num3");
				double input3 = input.nextDouble();
				
			double largest = (input1 > input2 && input1 > input3) ? input1
					: (input2 > input1 && input2 > input3) ? input2
					: input3 ;
			System.out.println("Largest number is: " + largest);
			
		}
		
}
