/**
 * 
 */
package NumericProblems;

import java.util.Scanner;

/**
 * @author Ananda
 *This is one of the very common program in all languages.
 *Fibonacci numbers are used to create technical indicators using a mathematical sequence 
 *developed by the Italian mathematician, commonly referred to as "Fibonacci,"
 * For example, the early part of the sequence is 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,144, 233, 377, and so on
 * 
 * This program will calculate and print first "N" Fibonacci number where "N" will be input by user
 */
public class FibonacciSeries 
{


	public static void main(String[] args) 
	{
		//input to print Fibonacci series upto how many numbers 

		System.out.println("Enter number upto which Fibonacci series to print: "); 
		int number = new Scanner(System.in).nextInt();

		// Call the method to calculate and Print Fibonacci series upto the number entered by user
		calculateFibonacci(number);
	}

	//Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
	public static void calculateFibonacci(int num) 
	{
		int fibo1 =0;
		int fibo2= 1;
		int fibonacci=0; //initialize the number
		System.out.println("Fibonacci series upto " + num + " is as follows:");
		
		//If the input number is 1,  Print 1
		if(num == 1)
		{ 
			System.out.println(0); 
			
		} 
		//When the input number is = 2
		else if(num == 2)
		{
			System.out.println(0 + " " +1);
		}
		//When the input number is more than 2
		else
		{
			//Print first 2 numbers of the Series
			System.out.println(fibo1 + "\n" + fibo2);
	
			for(int i= 3; i<= num; i++)
			{ 
				//Fibonacci number is sum of previous two Fibonacci number 
				fibonacci = fibo1 + fibo2; 
				fibo1 = fibo2; 
				fibo2 = fibonacci; 
				System.out.println(fibonacci);
			}	
		}
	}
}
