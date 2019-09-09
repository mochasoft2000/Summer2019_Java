package Day11_If_Else_Statement_Reviews;

public class test {

	public static void main(String[] args) {

		int age = 34;

		boolean GoodPerson = false;

	
		if (age >= 18) {

			System.out.println("you can buy milk");

			if (GoodPerson) {

				System.out.println("Alcohol is bad for your health");

			}

			else { // GoodPerson=false, && age >=18

				System.out.println("You can buy Cigrates");

				if (age >= 21) {

					System.out.println("You can buy Hookah");

				}

				if (age >= 25) {

					System.out.println("You can buy Alcohol");
				}
			}
		}
	
	
	}
}
