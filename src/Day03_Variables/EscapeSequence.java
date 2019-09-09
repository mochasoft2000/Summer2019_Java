package Day03_Variables;

public class EscapeSequence {

	
		public static void main(String[] args) {
			
			/*
			 \n this will break the sentence and brings it to next line
			 \t this will tab the sentence
			 \\ this will allow to print a slash on a statement
			 \' this will print single quote
			 \" this will print double quote
			 */
			
			System.out.println("This is such a long line\n\n\nI think I'm going to break it in two");
			System.out.println();
			System.out.println("");
		
			System.out.println("\tWill tab the sentence horizontally");
			
			System.out.println("\\Mike");
			System.out.println();
			System.out.println("Book is named \'Game of Thrones");
			System.out.println("Book is named \"Game of Thrones\"");
		
		}
}
