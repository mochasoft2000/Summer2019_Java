package Day12_SwitchStatement;

public class WarmUp {

	/*
	 * declare 3 numbers and check their equalities.
	 * if n1 and n2 are equal = n1&n2 are equal
	 * if n2 and n3 are equal = n2&n3 are equal
	 * if n3 and n1 are equal = n1&n3 are equal
	 * if all equal = all are equal
	 * if none are equal = none of them are equal
	 */
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 10;
		int c = 0;
		
		if(a == b && b != c) {
			System.out.println("a and b are equal");
		}
		else if(a == c && a != b) {
			System.out.println("a and c are equal");
		}
		else if(b == c && b != a) {
			System.out.println("b and c are equal");
		}
		else if(a == b && b == c && a == c) {
			System.out.println("all are equal");
		}
		else {
			System.out.println("none are equal");
		}
	}
}
