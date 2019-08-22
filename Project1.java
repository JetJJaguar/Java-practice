import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Project1 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Please enter file name. Ensure it is saved in the current Project folder" );

		Scanner input1= new Scanner(System.in);

		String filename= input1.next();

		Scanner input2= new Scanner(new File(filename));

		Scanner input3= new Scanner(new File(filename));

		int count = input2.nextInt();

		double mean =	Mean(count, input2);

		double deviation = Deviation (count, input3, mean);

		Printing(mean, deviation, count);
		
		input1.close();
	}

	public static double Mean(int R, Scanner read)//I didn't use an array to calculate the mean
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

	public static double Deviation (int R, Scanner read, double mean)
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
			deviation [j] = Math.pow((array[j]-mean), 2);	
			sumD = deviation[j] + sumD;
		}

		double inside= 1/(double)R;

		double finishD = Math.sqrt(sumD*inside);

		return finishD;
	}

	public static void Printing(double x, double d, int R){

		System.out.println("\nThere are " + R + " numbers in the file.\n");	

		System.out.printf("The mean of the numbers in the file is: " + "%.3f",x);

		System.out.println("\n");

		System.out.printf("The standard Deviation is: " + "%.3f", d);

		System.out.println();	

	}
}


