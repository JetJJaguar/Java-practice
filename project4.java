import java.util.*;


public class project4 {


	private static Stack<Character> stack;
	private static Scanner read;
	private static Queue<Character> pow;
	private static String test;
	private static int t;



	public static void main(String[] args) {

		System.out.println("Enter a word with no spaces:");
		parameters();
		StackinQueuein(t);
		Check();
	}


	public static void parameters(){
		read = new  Scanner(System.in);
		test = read.next();
		t = test.length();
		stack = new Stack<Character>();
		pow = new LinkedList<Character>();
	}

	public static void StackinQueuein(int t){

		for (int i=0; i < t; i ++)
		{
			stack.push(test.charAt(i));
			pow.add(test.charAt(i));

		}
		//System.out.println(stack.toString());
		//System.out.println(pow.toString());
	}		

	public static void Check(){
		boolean check = true;
		while (!pow.isEmpty()) {
			if (pow.remove().equals(stack.pop())) {
				check = true;
			} else if (!pow.remove().equals((stack.pop()))){
				check = false;

			}
		}
		if (check == false) {
			System.out.println("This word is not a palindrome");
		} else {
			System.out.println("This word is a palindrome");

		}
	}




}



