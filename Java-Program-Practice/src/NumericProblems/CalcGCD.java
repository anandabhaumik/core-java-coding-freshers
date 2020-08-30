/**
 * 
 */
package NumericProblems;

import java.util.Scanner;

/**
 * @author unbla
 *
 */
public class CalcGCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Enter two number whose GCD needs to be calculated. 
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the first number :"); 
		int number1 = scanner.nextInt(); 
		System.out.println("Enter the second number: "); 
		int number2 = scanner.nextInt(); 
		
		System.out.println("GCD of the two entered numbers " + number1 +" and " + number2 +" is :" + findGCD(number1,number2));


	}

	private static int findGCD(int number1, int number2) 
	{ 
		//Stopping condition
		if(number2 == 0)
		{ 
			return number1; 
		} 
		//Call using Recursion
		return findGCD(number2, number1%number2); 
	}
}

	
