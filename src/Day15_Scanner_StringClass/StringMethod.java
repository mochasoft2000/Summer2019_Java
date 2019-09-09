package Day15_Scanner_StringClass;  // charAT method

public class StringMethod {
		
		public static void main(String[] args) {
			
			String str = "Cybertek";  // charAt method
			// index number 01234567 for Cybertek
			// to find out the index number of the string we use charAt(index)
			
			System.out.println(str.charAt(4));  // this returns the letter r as char value
			    
				char ch = str.charAt(4);   // this assigns the index for to char
					System.out.println(ch);
					
					// lenth() method  --- counts the total number of characters in string and return as an int
					
					// String name= "Donald Trump"
					// int n = name.length()    This returns 14 for int n
					
					// concat() method :  --- basically takes another string value and joins(concat) it to 
					// string variable.  after that it will return a new string value.
					/*
					 * String s1 = "Cybertek"
					 * 		s1.concat("school")
					 * 	System.out.println(s1)  -- you will see the original value Cybertek as string is immutable
					 * 		S1 = S1.concat();
					 * toUpperCase method
					 * 
					 * String N = "cybertek"
					 *  N.toUpperCase();  ---- this keeps cybertek at lower case because it immutable
					 *  N = N.toUpperCase();  ----- by having N = N.toUpperCase()   this converts it to CYBERTEK
					 *  
					 *  toLowerCase method   --- reverse of toUpperCase method
					 *  
					 *  indexOf()   method ---- 
					 *  
					 *  
					 *  REVIEWS :  charAt(index), lenth(), concat(), toUpperCase, toLowerCase, indexOf
					 */
					
					
					String a = "Batch 12 Javengers";
					 a.charAt(9);
					 	System.out.println(a.charAt(9));  // returns J in the Javengers
					 	
					 	char ch2 = (a.charAt(11));     // returns v in the Javengers
					 	System.out.println(ch2);
					 	
					 int length = a.length();   // returns total 18 // length method
					 	System.out.println(length);
					 	
					 String b = "Cybertek";  // concat method
					 	b.concat(" Batch 12 Javengers:");
					 	
					 	b = b.concat(" Batch 12 Javengers:");
					 	
					 	System.out.println(b);
					 	
					 String d = "book";
					 	System.out.println(d.toUpperCase());  // this returns BOOK
					 	
					 String e = "BOOK";
					 	System.out.println(e.toLowerCase());  // this returns book
					 			
					
		}
}
