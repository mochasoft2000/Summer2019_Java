package Day04_Variables2;

public class WarmUpTest {

		/*
		 1. Cucumber $2.5 
		 2. Tomato $3
		 3. Onion $1.5
		 4. Green Pepper $2
		 5. Carrots $4
		 
		 */
	public static void main(String[] args) {
		
		float Cucumber = 2.5f;   //float variable requires an l or L tag
		double Cucumber2 = 2.5f; //double variable can contain float variable as double is larger
		double Cucumber3 = 2.5;
	
		float onion = 1.5f;
		double onion2 = 1.5;
		
		byte GreenPepper = 2;
		short GreenPepper2 = 2;
		int GreenPepper3 = 2;
		long GreenPepper4 = 2L;
		float GreenPepper5 = 2; // no need to add l or L in this case because only need to tag decimals.
		double GreenPepper6 = 2;
	
	System.out.println(GreenPepper);
	System.out.println(GreenPepper2);
	System.out.println(GreenPepper3);
	System.out.println(GreenPepper4);
	System.out.println(GreenPepper5);
	System.out.println(GreenPepper6);
	
	System.out.println();
	
	System.out.println(Cucumber);
	System.out.println(Cucumber2);
	System.out.println(Cucumber3);
	
	System.out.println(onion);
	System.out.println(onion2);
	}
}
