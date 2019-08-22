import java.util.*;
public class Recursion {
	
	private static Scanner read = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		String check = read.nextLine();
		int p = check.length();
		int r = check.length() - 1;
	recursion(p , r, check);

	}
	public static void recursion(int p, int r, String check) {
		
		
		
		if ( p == 0){
			System.out.print("-" + check.substring(0));
			
		}
		
		else {
			System.out.print(check.substring(r, p));
			recursion( p - 1, r - 1, check);
			
		}
	}
}
