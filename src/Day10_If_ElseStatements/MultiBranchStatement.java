package Day10_If_ElseStatements;

public class MultiBranchStatement 
{

	/* 
	 Task 01:
	  	90 >= Grade ==> A
	  	80 >= Grade <90  ==>B
	  	70 >= Grade <80  ==>C
	  	60 >= Grade <70  ==>D
	  	else ==> fail
	 
	 */
	public static void main(String[] args) 
	{
		
		int grade = 30;
	
		if(grade >= 90)
		{
		System.out.println("You Made A");
		}
		else if(grade <90 && grade >= 80)
		{
		System.out.println("You made B");
		}
		else if(grade < 80 && grade >=70)
		{
		System.out.println("You made C");
		}
		else if(grade < 70 && grade >= 60)
		{
		System.out.println("You made D");
		}
		else System.out.println("you have Failed");
	
	}
}
