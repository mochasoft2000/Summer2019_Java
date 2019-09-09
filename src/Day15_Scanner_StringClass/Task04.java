package Day15_Scanner_StringClass;

import java.util.Scanner;

public class Task04 {

		public static void main(String[]  args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter your first name");
			String firstname = input.nextLine();
			
			System.out.println("Enter your last name");
			String lastname = input.nextLine();
			
				System.out.println(firstname + " " + lastname);
				
			input.close(); // this gets rid of warning for Scanner input = new Scanner
			
		}
		
}
