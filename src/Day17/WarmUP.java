package Day17;

import java.util.Scanner;

public class WarmUP {

		public static void main(String[]  args) {
			
			Scanner input = new Scanner (System.in);
			
			
			System.out.println("Enter first name and last name");
			String fullname = input.nextLine();
				int fullnamecount = fullname.length();
			
			
			System.out.println("Your name is " + fullname);
			System.out.println(fullnamecount);
			
		}
}
