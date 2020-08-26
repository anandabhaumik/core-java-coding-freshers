/**
 * 
 */
package NumericProblems;

import java.util.Scanner;

/**
 * @author unbla
 *
 */
public class FirstNPrimeNumbers 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int number =0;
		char ch= 'y';
		//Run the program until user enters 'n'
		while(ch!='n')
		{
			//input a number to examine whether Prime or Not 
			System.out.println("Enter number upto which Fibonacci series to print: "); 
			number = new Scanner(System.in).nextInt();
			
			displayFirstNPrimeNumbers(number);
			//Scan user input, continue loop if user enters any char other than 'n'
			System.out.println("Enter a key to continue; Please press 'n' to exit: "); 
			ch = new Scanner(System.in).next().charAt(0);
		}
		System.out.println("Program ends");
		System.exit(0);
	}

	public static void displayFirstNPrimeNumbers(int num)
	{
		int i,j, count = 0;

		if (num < 2) 
		{
			System.out.println("This is not a valid input");
		} 
		else 
		{
			
			System.out.println("The list of Prime numbers upto : "+ num +" are given as follows\n ");
			//Run a loop upto the entered number
			for(i=1;i<num;i++)
			{
				count=0;
				//Run a loop from 1 until the outer loop number i
				for(j=1;j<=i;j++)
				{
					//Check if the outer loop number i is divisible by any number between 1 to i  
					if(i%j==0)
					{
						count ++;
					}
				}
				// If i is divisible only by 1 and i then i is a Prime number 
				if(count==2)
				{
					System.out.println(i);
				}
			}
		}
		
	}
}
