package Day06_ArithmeticOperators;

public class PrimitiveCasting {

	/*
	 casting: converting larger primitive to smaller size
	    datatype variablename = (datatype) value
	    
	    castings are either Explicit & Implicit
	     	Explicit Casting is converting larger to smaller primitive
	     	
	 primitives: byte,short,int,long,float,double
	 
	 
	 */
	public static void main(String[] args) {
		
		int a=10;  //typically you won't be able to convert int to byte being int is larger unless you do this
		           // explicit casting
		byte b= (byte) a;
		
		System.out.println(b);  //printed 10
		
		double DecimalNumber = 10.5;
		float FloatNumber = (int) DecimalNumber;
		
		System.out.println(FloatNumber);
		
		long LongNumber = 300L;
		int Intnumber= (short) LongNumber;
		
		
		// implicit casting:
		
		 byte ByteNum = 10;
		 int Intnum2= ByteNum;
		 int Intnum3 = (int) ByteNum;
				 
		
		 float FloatNumber2 = 500.67F;
		 
		 int myNumber = (short)FloatNumber2; // so casting to short gives 500
		 
		 
		 
		 
		 
		 
	}
	
	
}
