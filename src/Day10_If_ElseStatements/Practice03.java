package Day10_If_ElseStatements;

public class Practice03 
{

	public static void main(String[] args) 
	{
		
		int num1 = 200, num2= 300, num3= 50;
				
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the bigger number");
		}
		
		else if(num2 > num1 && num2>num3) {
			System.out.println(num2 + " is the bigger number");
		}
		
		else if(num3 > num1 && num3 > num2) {
			System.out.println(num3 + " is the bigger number");
		}
		
		
	}
}
