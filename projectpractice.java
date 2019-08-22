import java.io.*;
import java.util.Scanner;
import java.util.Stack;
public class projectpractice {
	private static Scanner read;
	private static Stack<Integer> stack;
	private final static String h = "h";
	private final static String q = "q";

	public static void main(String[] args)  {
		stack = new Stack<Integer>();
		int op1, op2, result = 0;
        String token;
        Scanner parser = new Scanner(expr);

        while (parser.hasNext())
        {
            token = parser.next();

            if (isOperator(token))
            {
                op2 = (stack.pop()).intValue();
                op1 = (stack.pop()).intValue();
                result = evaluateSingleOperator(token.charAt(0), op1, op2);
                stack.push(new Integer(result));
            }
            else
                stack.push(new Integer(Integer.parseInt(token)));
        }

        return result;
	}
	
}