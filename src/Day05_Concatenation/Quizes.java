package Day05_Concatenation;

public class Quizes {
	public static void main(String[] args) {  //main method is the entry point of java application
		                                      //static public void main(String[] args) is another main method
		
		/*
		 Multiple ways to declare Main Method:
		 
		 	1- public static void main(String[] args){  }
		 	2- static public void main(String[] args){  }
		 	3- public static void main(String... args){ }
		 */ 
		
		int num = 1;
		float fnum = num;
		
		System.out.println(fnum);  // printed out 1.0 as float is designed for decimal and converted integer 1 to 1.0
		System.out.println();
		
		long lnum = 1_000_000_000; // printed 1.0E9 which is 1.0 exponential to the ninth
		float fnum2 = lnum;
		
		int inum2 ='A';   // inum2 printed out 65 as int converted the char value of A to ASCI value 65
		char char1= 65;                 // declare char value like this char1= 'A'  
		                                //                              char2= 65
		
		System.out.println(inum2);
		System.out.println(char1);
		System.out.println(fnum2);
		
		/*
		  sequences
		  \n (or \r)  
		  \t   horizontal tab
		  \\   includes a single slash on print out 
		  \'
		  \"
		 */
		
		System.out.println("Today is a great Day\n Friday"); // this printed Today is great day
		System.out.println("\tTomorrow is Saturday, it's a great day");     // printed Tomorrow with tab                                                //               Friday
		System.out.println("\\");
		System.out.println("\' Game of Throne");
		System.out.println("\"Game of Throne\" ");
	}
	
}
