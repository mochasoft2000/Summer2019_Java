package Day08_Operators;

public class WarmupTask2 {

	
		public static void main(String[] args) {
			
			int x=2;
			int y= x++;
			System.out.println( y );
			
			int a = 2;
			System.out.println(a++);
			
			int c = 2;
			System.out.println(--c);
			
			int d = 8;
			int e = d--;
			System.out.println(e);
			
			int f = 4;
			int g = f * 4 - f++;
			System.out.println(g); // 4 times 4 euqal 16 then minus 4 equal 12
			
			
			
		}
}
