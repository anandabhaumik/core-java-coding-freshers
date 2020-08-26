/**
 * 
 */
package NumericProblems;

import java.util.Scanner;

/**
 * @author Ananda This is another very common program to practice loop and
 *         condition statement This program will validate whether a given number
 *         is Prime or not A prime number is a number which is not divisible by
 *         any other number, e.g. 3, 5, 7, 11, 13, 17,
 */
public class CheckPrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		// input a number to examine whether Prime or Not
		System.out.println("Enter a number to check whether it is a Prime number or not: ");
		int number = new Scanner(System.in).nextInt();

		checkIfPrime(number);

	}

	// This method will accecpt the number and will check whether it's a Prime
	// number or not
	public static void checkIfPrime(int num) 
	{
		int i, count = 0;

		if (num < 2) 
		{
			System.out.println("This is not a valid input");
		} 
		else 
		{
			// Run a loop from 1 upto the provided number
			for (i = 1; i <= num; i++) 
			{
				// If the number is divided by i then increment the count variable
				if (num % i == 0) 
				{
					count++;
				}
			}

			// If the number is divisible only by 1 and the number itself then the Count
			// will be 2 and will consider as Prime
			if (count == 2)
			{
				System.out.println("The number: " + num + " is a Prime number");
			}

			// If the number is divisible by more than 2 numbers then it's not a Prime
			// number
			else 
			{
				System.out.println("The number: " + num + " is not a Prime number");
			}
		}
	}
}
