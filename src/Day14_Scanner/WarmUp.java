package Day14_Scanner;

public class WarmUp {

	/*
	 * 1- Write a program that can display the days Monday-Sunday
	 * if the day is Monday or Tuesday:  Java class day
	 * if the day is Thursday or Friday: Selenium class day
	 * if the day is Wednesday or Saturday: SQL class days
	 * otherwise: day off
	 * 
	 * Remember: switch statement cannot accept: boolean, flat, double, long.
	 */
	
	public static void main(String[]   args) {
		
		String day = "Tuesday";
		
		switch (day) {
		
			case "Monday":
			case "monday":
				System.out.println("Java class");
				break;
				
			case "Tuesday":
			case "tuesday":
				System.out.println("Java class day");
				break;
			
			case "Wednesday":     // using Or logic this way in switch statement
			case "Saturday":
				System.out.println("SQL class day");
				break;
			
			case "Thursday":    // using OR logic this way in switch statement
			case "Friday":
				System.out.println("Selenium class");
				break;
				
			default:  //This will be Sunday
				System.out.println("day off");
				
		
		
	}
}
}