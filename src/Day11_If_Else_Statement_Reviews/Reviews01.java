package Day11_If_Else_Statement_Reviews;

public class Reviews01 
{

			// age >= 18 => cigar
			// age >= 21 => hookah
			// age >= 25 => alcohol
			// age < 18 => milk
	public static void main(String[] args) {
		
		int age = 40;	
		
		boolean validage = (age >= 18);
		boolean cigar = age >= 18;
		boolean hookah = age >=21;
		boolean alcohol = age >=25;
		boolean car = age >= 40;
			if (validage) {
				System.out.println("you can buy the following");
				
				if (cigar) {
					System.out.println("cigar");
				}
				
				if(hookah) {
					System.out.println("hookah");
				}
				
				if(alcohol) {
					System.out.println("alcohol");
				}
				
				if(car) {
					System.out.println("car");
				}
				
			}
			else {
				System.out.println("You are underage and cannot buy items");
			}
			
			
			
			
	}
			
		
		
	
	
}
