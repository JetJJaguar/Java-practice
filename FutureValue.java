import java.math.*;
import java.util.*;
public class FutureValue {
	static Scanner calculate = new Scanner(System.in);
	/**
	 * Christian Montes
	 * 10/20/2016
	 * Project 4:  Future Value of Periodic Savings
	 * This program calculates the number of deposited payments (N), the amount deposited (P),
	 * 	and the interest rate (R).  The program will then display the amount in the account after
	 * 	the user enters all prompted information.
	 */
	
	public static void main(String[] args) {
	
		PrintDirections();
		
		double P= GetPmt(calculate);
		double R= GetRate(calculate);
		int N= GetNumWeeks(calculate);
		double FV=Compute_FV(P,R,N);
		
		Report_FV(P,R,N,FV);
	}
	
	
	public static void PrintDirections() {
		
		System.out.println("First type the exact amount paid.");
		System.out.println("Next type the interest rate.");
		System.out.println("Finally type the number of weeks.");		
		System.out.println();
	}
	
	public static double GetPmt (Scanner calculate) {
		
		System.out.println("What is the amount being payed, please enter only the numbers.");
		double payment = calculate.nextDouble();
		 return payment;
		 	}
	
	public static double GetRate (Scanner calculate) {
	
		System.out.println("What is the rate, please enter the percentage");
		double interest =calculate.nextDouble();
		return interest;
	}

	public static int GetNumWeeks (Scanner calculate) {
		
		System.out.println("How many weeks has it been?");
		int weeks = calculate.nextInt();
		return weeks;
		}
		
	public static double Compute_FV(double P, double R, int N) {
		
		double r= R/5200;
		double FutureValue= ((P*(Math.pow((1+r), N)-1)*(r+1))/r);
			return FutureValue;
		
	}
	public static void Report_FV(double P, double R, int N, double FV) 
	{
		
		System.out.println();
		System.out.printf("The amount payed is $%.2f\n", P);
		System.out.print("The Interest Rate is %");
		System.out.printf("%.3f\n", R);
		System.out.println("The Number of weekly payments is " + N);
		System.out.print("The Future Value of " + N + " weekly payments of $");
		System.out.printf("%.2f", P);
		System.out.print(" at a rate of %");
		System.out.printf("%.3f", R);
		System.out.print(" is\n");
		System.out.printf("$%.2f", FV);
	}

}