package Day10_If_ElseStatements;

public class WarmUpTask02 
{
	public static void main(String[] args) 
	{
		// grade A 100-90
		//       B 89-80
		//       C 79-70
		//       D 69-60
		//       E 59-50
		//       F 49-40
		//       G 39-30
		
		int grade = 65;
		boolean validgrade = grade >= 0 && grade <= 100;
		
		if(validgrade) 
		{
		
				if(grade >= 90) {
					System.out.println("You passed with A");
				}
				else if(grade >=80 && grade <90) {
					System.out.println("you passed with B");
				}
				else if(grade >= 70 && grade < 80) {
					System.out.println("You passed with C");
				}
				else if (grade >= 60 && grade < 70) {
					System.out.println("You passed with D");
				}
				else if (grade >= 50 && grade < 60) {
					System.out.println("You passed with E");
				}
				else {
					System.out.println("You need more practice but keep it up.");
				}
		}
			
		else {
			System.out.println("Invalid input");
			}
		
	}
}







