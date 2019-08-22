import java.util.*;
import java.io.*;

public class Project1b

{
	private static String fileName = null;
	private static int imageHeight =0;
	private static int imageWidth=0;
	private static char [] [] buffer= new char [100][100];
	private static Scanner  input = new Scanner(System.in);
	/*
    FUNCTION NAME: Main ;
    INPUT: none.
    OUTPUT: a message to the user of this program, all of the
    prompts and a final display according to user specifications.
    PRECONDITIONS:  None.
    POSTCONDITIONS: Variables and calls made according to users input
                    output set to start on a new line.
    CALLERS: none
    CALLES: WHat does this method call. it calls the functionsaskPermission, getParameters(), getImage(), and doTileJob().

	 */

	public static void main(String args[]) throws FileNotFoundException
	{
	
	
		
		while (askPermission() == true){

			getParameters();
			getImage();
			printImage();
		}
	}
		




	

	/*
    FUNCTION NAME: askPermission ;
    INPUT: none.
    OUTPUT: a message to the user of this program.
    PRECONDITIONS:  output set to start on a new line.
    POSTCONDITIONS: variable response has user's answer stored in it.
    CALLERS: the main program
    CALLES: None.

	 */

	public static boolean askPermission()
	{//a yes or no question
		
		System.out.println("Would you like to run the program?");
		
		System.out.println("Please Enter Y to run, any other letter will end the program");
		
		Scanner console = new Scanner(System.in);
		
		String y = console.next();
		
		if (y.equalsIgnoreCase("Y"))
			
		{
			return true;
		}
		else {
			
			return false;
		}
		
	}


	/*
   FUNCTION NAME getParameters ;
   INPUT: the file name, number of tiles across and down.
   OUTPUT: message "Getting Image".
   PRECONDITIONS: the variable response has 'y' in it.
   POSTCONDITIONS: variables set with the values entered by user.
   CALLERS: the main program
   CALLEES: none
	 */

	static void getParameters() throws FileNotFoundException
	{ 
		System.out.println("Please enter the file name");
		
		fileName= input.next();
		
		Scanner reader= new Scanner(new File(fileName));
		
		imageHeight= reader.nextInt();
		
		imageWidth= reader.nextInt();

		
	}

	/*
    FUNCTION NAME: getImage file name form the user;
    INPUT:the file name and the height and width of the pattern to be made.
    OUTPUT: the message "Getting Image".
    PRECONDITIONS: array for image declared, the variables fileName, 
				   imageHeight and imageWidth set with proper values.  
    POSTCONDITIONS: the image is stored in the array.
    CALLERS: the main program
    CALLEES: none
	 */
	public	static void getImage() throws FileNotFoundException
	{
		Scanner reader= new Scanner(new File(fileName));
		
		reader.nextInt();
		reader.nextInt();
		
		for (int i = 0; i < imageHeight; i ++)
		{
			String q= reader.nextLine();
			
		
			
			for (int j = 0; j < imageWidth; j++)
			
			{ 
						
				buffer [i][j]= q.charAt(j);
			
			}
		
		}


	}



	/*
    FUNCTION NAME: printImage put in array
    INPUT:the buffer with the image and the height and width of the
          pattern to be made
    OUTPUT: the patterns structured according to users input.
    PRECONDITIONS: All of the variables are set and pattern is stored in 'buffer'.
    POSTCONDITIONS: Output displayed according to users input.
    CALLERS: the main program
    CALLEES: none
	 */
	//  This function uses for loops to display the images. The inner most for loop prints one line of the picture.


	public static void printImage()
	{
		for (int i = 0; i < imageHeight; i ++)
	
		{
		
			for (int j = 0; j < imageWidth; j++)
		{ 
			
				System.out.print(buffer[i][j]); 
		
		}
	
		}
	}

}