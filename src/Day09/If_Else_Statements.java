package Day09;

public class If_Else_Statements {
/*
 	single if statement: 
 		
 		IF BLOCK
 		
 		starts with if(boolean expression) if the boolean epxression is true so whatever you have
 		in this block gets executed.  ONLY when TRUE.
 
 
 
 
 
 
 
 */
	
	
	public static void main(String[] args) {
		
		if (true) {
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("Tomorrow is day off");
			
		}
		
		int a= 1000;
		if (++a == 1001) {
			a=2000;
			System.out.println("a is increased");
			
			System.out.println(a);
		}
		
		
		int x=98765432;
		if (x%2 == 0) {
			System.out.println("it's an even number");
				
		}
		
		if (x%2 != 0) {
		System.out.println("it's an odd number");	
		}
		
	
		int Y= 2345678;
		if(Y%5 == 0) {
			System.out.println(Y + "can be divided by 5");
			
		}
		
		if (Y%5 != 0) {
			
			System.out.println(Y + " cannot be divided by 5");
			
		}
		
		String CEO = "Main Boss";
		String Kuzzat = "Main Boss";
		
		System.out.println(CEO == Kuzzat);
		
		if(Kuzzat == CEO) {
			
			
		}
		
		double TotalNumber = 100;
		boolean Cybertek = true;
		boolean BestSchool = true;
		
		if(Cybertek == BestSchool) {
		
			TotalNumber +=500;	
		
			System.out.println(TotalNumber);
		}
	
		if(Cybertek != BestSchool) {
			
			TotalNumber -=50;
			
			System.out.println(TotalNumber);
		}
		
		
		/*
		 write a program:
		 1- declare variable and initialize user age
		 2- write program if the user is eligible to vote for Donald Trump vote age 18

		 */
		
		byte personAge = 78;
		
		if(personAge >= 18) {
			
			System.out.println("This person is 18 and older and eligible to vote");
		}
		
	
			
		
	}	
		
		
	
}
	

