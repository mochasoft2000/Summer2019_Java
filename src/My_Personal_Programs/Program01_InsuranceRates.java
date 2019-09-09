	/*
	 * Create an Insurance quote program.
	 * Request user's name
	 * Request user's age
	 * Request user's credit score. Please enter 0-800.
	 */








package My_Personal_Programs;

import java.util.Scanner;

public class Program01_InsuranceRates {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);    // This requests various inputs from user
		
		System.out.println("This is Bug Buster insurance quote:");
		System.out.println("Please enter your name");
			String name = input.nextLine();
		
		System.out.println("What is your age:");   // This request user's age.
			int age = input.nextInt();
		
		System.out.println("What is your current credit score between 0 and 800:");    //This request user credit score
			int creditscore = input.nextInt();
			
		System.out.println("What is the current market value of your car"); // Request car value
			double carvalue = input.nextDouble();
			
			
	
	
		boolean validage = age>= 18;   // this sets the range for age
		boolean age_group_1 = (age >= 18 && age < 30);  // rate points charge is 4
		boolean age_group_2 = (age >= 30 && age < 50);  // rate points charge is 3
		boolean age_group_3 = (age >= 50 && age < 60);  // rate points charge is 2
		boolean age_group_4 = (age >= 60);              // rate points charge is 1
		
		boolean validCreditScore = creditscore >= 0 && creditscore <= 800;  // this sets range for credit scores
		boolean credit_group1 = (creditscore >= 0 && creditscore < 400);  // rate points charge is 4
		boolean credit_group2 = (creditscore >= 400 && creditscore < 600); // rate points 3
		boolean credit_group3 = (creditscore >= 600 && creditscore < 700); // rate points 2
		boolean credit_group4 = (creditscore >=700);                       // rate points 1
		
		boolean validCarValue = carvalue >= 0;   // this sets range for car value
		boolean carvalue_group1 = (carvalue > 0 && carvalue < 30_000);   // rate points 1
		boolean carvalue_group2 = (carvalue >= 30_000 && carvalue < 60_000); // rate points 2
		boolean carvalue_group3 = (carvalue >= 60_000);                   // rate points 3
		
		int ag = 0; // initial points value for each age group, credit group and car value group
		int cg = 0;
		int cv = 0;
		
		if (validage){
			if (age_group_1) {
				ag = 0 +4;
			}else if (age_group_2){
				ag = 0+3;
			}else if (age_group_3){
				ag = 0+2;
			}else {
				ag = 0+1;
			}
		
			if (credit_group1) {
				cg = 0+4;
			}else if (credit_group2) {
				cg = 0+3;
			}else if (credit_group3) {
				cg = 0+2;
			}else{
				cg = 0+1;
			}	
			
			if (carvalue_group1){
				cv = 0+1;
			}else if(carvalue_group2){
				cv = 0+2;
			}else{
				cv = 0+3;
				}
		
			
			
			int finalrate = (ag+cg+cv)*50;	
			
			System.out.println(name + " your yearly rate is: $ " + finalrate);
			
			
		}else {
			System.out.println(name + "your age doesn't qualify for insurance");
		}
		
		
			
		
		}
}
		
	
		
		
		
		

