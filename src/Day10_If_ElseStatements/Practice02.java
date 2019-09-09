package Day10_If_ElseStatements;

public class Practice02 {

	public static void main(String[] args) {
		
		/*
		Write a program that
		1. 0 to 12 ==> good morning
		2. 12-15 ==> good afternoon
		3. 15-23 == good night

		*/

		int time = 11;

		if(time >= 0 && time < 12){
			System.out.println("Good Morning");
		}
		
		else if(time > 12 && time <= 15){
			System.out.println("Good Afternoon");
		}

		else if(time > 15 && time <=23){
			System.out.println("Good Evening");
		}
		else{
			System.out.println("noon");
		}
		
		
		
		
		
	}
	
	
	
	
	
}
