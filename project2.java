import java.util.*;


public class project2 {


	private static Scanner read;
	private static Stack<Integer> stack;
	private static int opr  = 0;
	private static int opr2 = 0;
	private static String token = null;
	private static int result = 0;



	public static void main(String args[]) 
	{       stack = new Stack<Integer>();
	//stack.clear();
	read = new Scanner(System.in);
	//need a loop here
	Directions();
	String w = "wee"; 
	while (w !="stop"){
		token = read.next();
		if (isOperator(token)){
			
			Compute(w);
		}
		else {
			
			stack.push(new Integer(Integer.parseInt(token)));


		}
	}



	}




	public static void Directions(){
		System.out.println("To use this program, type in at least two numbers first then use an operator");
		System.out.println("Only the operators +,-,*,/,% are acceptable. Any other operators will result in an error.");
		System.out.println("Use h for a list of commands.");

	}
	public static void helpDirections(){
		System.out.println("Any integer number is allowed.");
		System.out.println("p  print top");
		System.out.println("n  print top and remove");
		System.out.println("d  duplicate top");
		System.out.println("r  exchange top two items");
		System.out.println("f  print contents of stack");
		System.out.println("c clear stack");
		System.out.println("+  add");
		System.out.println("-  subtract");
		System.out.println("*  multiply");
		System.out.println("/  integer divide %  integer remainder");
		System.out.println("m  unary minus");
		System.out.println("q  quit");
		System.out.println("h,?  this help");

	}


	public static void Add(){//+
		opr = stack.pop();
		opr2 = stack.pop();
		result = opr + opr2;
		stack.push(result);
	}


	public static void Sub(){//-
		opr = stack.pop();
		opr2 = stack.pop();
		result = opr2 - opr;
		stack.push(result);
	}


	public static void Multi(){//*
		opr = stack.pop();
		opr2 = stack.pop();
		result = opr * opr2;
		stack.push(result);
	}


	public static void Div(){///
		opr = stack.pop();
		opr2 = stack.pop();
		result = opr2/opr;
		stack.push(result);
	}


	public static void Print(){//f
		System.out.print(stack.toString());

	}


	public static void Mod(){//%
		opr = stack.pop();
		opr2 = stack.pop();
		result = opr2 % opr;
		stack.push(result);
	}


	public static void Quit(String w){//q
		System.out.println("Goodbye.");
		w = "stop";
	}


	public static void Dup(){//d
		stack.push(stack.peek());
	}
	
	
	public static void Uinary(){//m
		opr = stack.pop();
		int uniary= opr * (-1);
		stack.push(uniary);
	}


	public static void Clear(){//c
		stack.clear();
	}


	public static void Exchange(){//r
		opr = stack.pop();
		opr2 = stack.pop();
		stack.push(opr);
		stack.push(opr2);
	}


	public static void Printtop(){//p
		System.out.println(stack.peek());
	}


	public static void Top(){//n
		opr =stack.pop();
		System.out.println(opr);	
	}


	public static boolean isOperator(String token){		
		return (( token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("h") || token.equals("q") || token.equals("f") 
				|| token.equals("r") || token.equals("c") || token.equals("n") || token.equals("m") || token.equals("p") || token.equals("d") || token.equals("%")));
	}

	public static void Compute(String w)// the important one. keep this one it is important. REMEBER IT IS IMPORTANT.

	{

		switch (token.charAt(0)){

		case '+':
			Add();
			break;
		case '-':
			Sub();
			break;
		case '*':
			Multi();
			break;
		case '%':
			Mod();
			break;
		case '/':
			Div();
			break;
		case 'q':
			Quit(w);
			break;	

		case 'h':
			helpDirections();	
			break;

		case 'd':
			Dup();
			break;

		case 'n':
			Top();
			break;

		case 'm':
			Uinary();
			break;

		case 'c':
			Clear();
			break;

		case 'f':
			Print();
			break;

		case 'p':
			Printtop();
			break;	

		case 'r':
			Exchange();
			break;

		
	}

}}