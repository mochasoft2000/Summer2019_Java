package Day11_If_Else_Statement_Reviews;

public class Reviews02 {

		// 1. write a program that can find the number of days in a month.
		//    Assume that Feb has 28 days
		// declare int month = 0-12
		// must use nested-if
		// 28 days is feb (2)
		// 30 days is 4,6,9,11
		// 31 days is 1,3,5,7,8,10,12
	
	public static void main(String[] args) {
		
							int month = 20;
		
							
							
							
			if(month>0 && month <13) {  // 1st deteremined the true "valid" parameter
				
				if(month == 1) {
					System.out.println("31 days");
				}
				else if(month == 2) {
					System.out.println("28 days");
				}
				else if(month == 3) {
					System.out.println("31 days");
				}
				else if(month == 4) {
					System.out.println("30 days");
				}
				else if(month == 5) {
					System.out.println("31 days");
				}
				else if(month == 6) {
					System.out.println("30 days");
				}
			}
			else {                   // this else covers all invalid outside month 1 to 12.
				System.out.println("invalid month entered");
			}
		
	}
	
}
