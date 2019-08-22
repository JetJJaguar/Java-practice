import java.io.*;
import java.util.Scanner;
public class februrarysecond {
//constant never changes but an object is changeable
		public static void main(String[] args) throws FileNotFoundException{
				Scanner console = new Scanner(System.in);
				
				System.out.println("Please enter the file name:");
				
				String name = console.next();
				
				Scanner input = new Scanner(new File (name));
				//in order to read the file a next thing is needed
				// a loop is needed so a while loop will be used. hasnext is the one that will be used
				while(input.hasNext())
				
				{
				String line = input.nextLine();
				//printing out to prove that the file was read
				System.out.println(line);
				}
				
		}}
