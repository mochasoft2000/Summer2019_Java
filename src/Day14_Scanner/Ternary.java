package Day14_Scanner;

public class Ternary {

	/*
	 * In if statement you provide the if(condition)  but in 
	 * Ternary statement you provide (condition)?
	 * in Ternary statement else you provide :
	 * in Ternary else-if you :(condition)?
	 * in Ternary body you can only give a single value
	 * in Ternary must be initialize to a variable and return a value
	 */
	
	public static void main(String[] args) {
		
		
		int score = 75;
		char Finals = ' '; // notice a space between single quote
		
		/*  Translating If-Else Statements to Ternary 
		
		if (score >= 90 && score <= 100)
			Finals = 'A';
		else if (score >= 80 && score <= 89)
			Finals = 'B';
		else if (score >= 70 && score <= 79)
			Finals = 'C';
		else if (score >= 60 && score <= 69)
			Finals = 'D';
		else if (score >= 0 && score <= 59)
			Finals = 'F';
		else Finals = '';
		*/
		
		Finals = (score >= 90 && score <= 100)  ? 'A'    // we are initializing Finals
				: (score >= 80 && score <= 89) ? 'B'
				: (score >= 70 && score <= 79) ? 'C'
				: (score >= 60 && score <= 69) ? 'D'
				: (score >= 0 && score <= 59) ? 'F'
				: ' ';
		
		System.out.println(Finals);
	}
	
}