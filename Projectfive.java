import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Projectfive {
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Please enter file name. Ensure it is saved in the current Project folder" );
		Scanner input1= new Scanner(System.in);
		String filename= input1.next();
		Scanner input2= new Scanner(new File(filename));
		Scanner input3= new Scanner(new File(filename));
		int count = input2.nextInt();
		double mean =	Mean(count, input2);
		double deviation = Deviation (count, input3);
		Printing(mean, deviation, count);
	}
		
	public static double Mean(int R, Scanner read)
	{
		
		double sumM=0;
		for (int i=0; i<R ; i++)
		{
			double t = read.nextDouble();
			sumM = (sumM+t); 
		}	
		
		double finishM = (sumM/R);
		return finishM;
				}
		
	public static double Deviation (int R, Scanner read)
		{	
		double sumD = 0;	
		double	array [] = new double [R];
		for (int i=0; i<R ; i++)
		{
			array[i] = read.nextDouble();	
		}
		double deviation [] = new double [R];
		for (int j=0; j<R ; j++)
			{
			deviation [j] = Math.pow((array[j]-10.625), 2);	
			sumD = deviation[j] + sumD;
		 }
		double inside= 1/(double)R;
		double finishD = Math.sqrt(sumD*inside);
		return finishD;
		}
			
	public static void Printing(double x, double d, int R){
		System.out.println("There are " + R + " numbers in the file.");	
		System.out.printf("The mean of the numbers in the file is: " + "%.3f",x);
		System.out.println();
		System.out.printf("The standard Deviation is: " + "%.3f", d);
		System.out.println();	
		}
}


