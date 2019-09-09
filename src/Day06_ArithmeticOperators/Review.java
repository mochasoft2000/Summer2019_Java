package Day06_ArithmeticOperators;

public class Review {
	
	public static void main(String[] args) {
		
		int a=10;  // create an equation that will allow you to switch the value a=15 then b=10
		int b=15;
					/*
					 This equation will not work:
					 a=b which makes a=15
					 b=a which makes b=15 as well as Java just ran the a=b making b=15
					 
					 SO SOLUTION IS BELOW
					 */
		
		System.out.println(a+ "\n" +b);
		
		a = a+b; //a=25
		b= a-b;  // 25-15 = 10  so now b=10  because Java is executing from top to bottom
		a= a-b;  // 25-10 = 15  so now a=15
		
		
		
	}
	
	
	
	
	
	
	
}
