package Day10_If_ElseStatements;

public class If_Else_Statement 
{
	
	/*
	  triangle has 3 angles
	  sum of three angles must be equal to 180
	  1. declare three variables angle1, angle2, angle3
	  2. write program to check triangle is valid or not
	 */
	
/*	public static void main(String[] args) 
	{
	
	int angle1 = 45, angle2 = 45, angle3 = 45;
	boolean valid = (angle1 + angle2 + angle3) == 180;
	
	if (angle1 > 0 && angle2 > 0 && angle3 > 0 && angle1 <180 && angle2 <180 && angle3 <180)
	{
	}
	
	if(valid)
	{
	System.out.println("this triangle is valid");
	}
	
	else
	System.out.println("This triangle is not valid");
	
	}
*/
	
	////  Second way of doing this problem
	
	public static void main(String[]  args)
	{
	
		int angle1 = -1, angle2 = 45, angle3 = 90;
		int validtriangle = angle1 + angle2 + angle3;
		
		if(validtriangle == 180)
		{
		System.out.println("This is a valid triangle");
		}
		
		else
		System.out.println("This is not a valid triangle");
	}
	
}
