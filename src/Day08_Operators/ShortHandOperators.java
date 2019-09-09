package Day08_Operators;

public class ShortHandOperators {

	
	/*
	 
	 +=; addition assignment
	 -=; subtraction assignment
	 
	 */
	
	public static void main(String[] args) {
		
		int a=9;
		a = a += 3; //12   a initialized to 12
		System.out.println(a);
		// instead of writing out this you can short hand a +=3 instead a= a+3
		
		int b = a += 5;  // noting a is now incremented to 17 a=17 and b=17
		System.out.println(b); // printed 17 taking 12+5 and b also now 17
		
		int c = a += b;  // at this point A is increment to 34 c= 34 but b = 17
		System.out.println(c); 
		
		int d = a += c; // at this point a= 68 c= 34 d= 68 b=17
		System.out.println(d);
		       //68  17x2=34
		int e = d += b *2; // d= 85 incremented by 34 d= 102 e=102 c34 b17
		System.out.println(e);
	
		System.out.println(b);
		
		
	//Subtraction assignment  -=  
		int g = 101;
		int h = g -= 1;
		System.out.println(h); // g = 100 h=100
		
		int i = g +=h +5; // g= 205 i=205 h=100
		
		int j = h += g % i;   // h=100 j=100
		     // 100 incremented by 205%205=0
			// 100 incremented by 0
		System.out.println(j);
		
		int k = j -= h *2 %5;
		     // j -= 100 times 2
		     // j -= 200 remainder 5 =0
		    // j -= 0 so J still 100
		System.out.println(k);
	
		// multiplication assignment *=  
		
		int A= 100;
		A *= 200; // A=20_000
		System.out.println(A);
		
		int B= 100; // B now 1000
		B *= 100/10; //1000 (basically first divide 100/10 the increment B by multiple 100x10
				
		B *=  B- 1000; //0 as 1000 multiply by group 1000-1000
		System.out.println(B);
		
		
	// Division assignment /=
		
		int C = 1000;
		C /= 5; //200      C=200
		System.out.println(C);
		
		int D = 10;   // C=20 D=10
		C /= D; //20
		System.out.println(C);
				
		C /= D + 10; // printed 1   C=1  D=10
		System.out.println(C);
				
	}
	
	
	
	
	
	
	
	
	
	
	
}
