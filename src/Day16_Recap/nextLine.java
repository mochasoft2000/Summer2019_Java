package Day16_Recap;

import java.util.Scanner;

public class nextLine {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter zipcode");
				int zipcode = input.nextInt();
				
					input.nextLine();  //  This takes the hidden ENTER from the nextLine below
				System.out.println("Enter city");
				String city = input.nextLine();
				
					
				System.out.println("Enter your state");
				String state = input.nextLine();
				
				System.out.println("zipcode is "+ zipcode);
				System.out.println("city is " + city);
				System.out.println("state is " + state);
			
		}
}
