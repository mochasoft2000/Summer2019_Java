package Day09;

public class Task05 
{

	
	/*
	 1. Declare a variable called num
	 2. Write a program that can check if number is positive, negative or equals to zero.
	 */
	
	
	public static void main(String[] args) 
	{
		
		int num = -7;	
		
			if ( num > 0) 
			{
			System.out.println("The number "+ num + " is positive number.");
			}
		
			if (num == 0)
			{
			System.out.println("The number " + num + " is equal to zero and neither positive or negative.");
			}
		
			if (num < 0)
			{
			System.out.println("The number " + num + " is negative number.");
			}
			
			if (num %2 == 0)
			{
			System.out.println("The number " + num + " is also an even number");
			}
			
			if (num %2 != 0)
			{
			System.out.println("The number " + num + " is also an odd number");
			}
			
			
	}
			
	

	
}
