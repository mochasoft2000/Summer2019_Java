package Day07_UnaryShorthand;

public class Quiz {

	public static void main(String[] args) {
		
		// Question 1
		int a=30;
		int b= (byte) a; // you can only cast to int,short,byte and cannot upcast to long,float, double etc
		System.out.println(b);  //printed 30 - casting
		
		
		// Question 2 failed to compiled due to line error.  System.out.print was executed before variable declared.
		
		// Question 3
		
		System.out.println("Result A"+0+1);
						// "Result A01"
		
		System.out.println("; Result B"+(1)+(2));
						// "; Result B12"
		
		System.out.println("Result B"+ (1+2));
						// Result B +3
		
		//Question 4
		
		System.out.println("5 + 2 =" +3+4); 
						//5 + 2 = 34   notice 5+2 is a text and then just the 3 and then 4
		System.out.println("5 + 2 = + (3+4)");
						// 5 + 2 = 7
		
		//Question 5
		
		float FloatNum = 100.98765432f;
		short ShortNum = (byte) FloatNum;
			System.out.println(ShortNum);
			
		//Question 6 could not compiled as variable byte a = 200 was over range.
			
		//Question 7
		
		System.out.println((3 + 2) *2 /3 % 2);
						//	5  * 2 / 3 % 2
						// 10 /3 remainder 2 = 1
		
		//Question 8
		
		//int a= 9, b=0, c= a/b this statement gave error message as 9/0 denominator cannot be 0
		
		//Question 9
		
		long LongNum = 3_000L;
		double dNum = (float) LongNum;
		int iNum = (int) dNum;
		System.out.println(iNum % 1000); // 3000/1000 so remainder 0
		
		//Question 10
		
		double result1 = 10/3;
		System.out.println(result1); // printed 3.0--> 10/3 are integers so the division only returned 3 but double converted to 3.0
		System.out.println( 10.0/3); // printed 3.33333 as 10.0 is double and not float as no f tag
		
		//Question 12 cannot do cast string as string is not a primitive data type
		
		//Question 13
		
		//Unary Operators in Java
		/*
		 	+:  means positive
		 	-: means negative
		 	++: increment (increases the value by 1.)
		 		2 types of increments;  Post increment or Pre increment
		 			1- pre-increment = operator is placed before variable ++num1
		 			2- post increment = operator is placed after variable  num1++
		 	--: decrement  (decreases the value by 1)
		 */
			int aint = 10;
			int bint = -10;
			
			int cint = +bint;
			System.out.println(cint); //printed +(-10) so -10 same as math
			
			int dint = -cint;
			System.out.println(dint); // printed 10 as negative of -10
			
			int num1 = 100;
			System.out.println(++num1);  //printed 101 as 100 increase by 1
			
			int num2 = ++num1; // printed 102
			
			System.out.println(num1++); // printed 102
			System.out.println(num2++); //printed 102 as this post increment will increase in next stage
			
			int x = 100;
			int y = x++ -1; 
			   //y = 100 - 1 = 99
			
			// Decrement: decreases value by 1
			// 1. Post Decrement
			// 2. Pre Decrement 
			int z = 100;
			System.out.println(--z);   //99
			System.out.println(z);    //99
			
			int w = 100;
			w--; // 99
			System.out.println(w); //99
			
			int f = 50;
			f = --f + f++ + f-- + f++;
			// pre    post  post  post
			// 49     49    50    49
			
			short L = 4;
			int M = L * 4 - L--;
			//      16 - 4
			System.out.println(M);  //printed 12
			System.out.println(L);  //printed 3
			
			int Q = 1;
			Q = - Q-- + Q++ / -Q-- * --Q;
			// post     post   post  pre
			// -1    +  0   / - 1 * -1
			// -1 + 0 * -1 = -1
			
			
			
	}
	
}
