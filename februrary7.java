import java.io.*;
import java.util.Scanner;

public class februrary7 {
	public static void main (String[] args) throws FileNotFoundException {
		Scanner file= new Scanner(System.in);
				int [] [] numbers = new int [6][5];
		
		numbers [0][0] = 5;
		
		for(int i = 0; i< numbers.length; i++) {
		
			for (int j = 0; j < numbers[i].length; j++){
				
				numbers [i] [j]= i+j;
				
			}
		 
		}
	}
}
