import java.util.Scanner;
public class Recursion2 {
	
	private static Scanner read = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		String check = read.nextLine();
		int p = 0;
		int r = 0 + 1;
	recursion(p , r, check);

	}
	public static void recursion(int p, int r, String check) {
		
		
		
		if ( p == check.length()){
			System.out.print("-" + check.substring(0));
			
		}
		
		else {
			System.out.print(check.substring(r, p));
			recursion( p + 1, r + 1, check);
			
		}
	}
}









