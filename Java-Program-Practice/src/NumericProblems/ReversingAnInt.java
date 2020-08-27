package NumericProblems;

import java.util.Scanner;

public class ReversingAnInt {

	public static void main(String[] args) 
	{
		int number =0;
		char ch= 'y';
		//Run the program until user enters 'n'
		while(ch!='n')
		{
			//input a number to reverse the digits 
			System.out.println("Enter a number to reverse : "); 
			number = new Scanner(System.in).nextInt(); 
			
			//Call the method to reverse the number
			reverseInt(number);

			//Scan user input, continue loop if user enters any char other than 'n'
			System.out.println("Enter a key to continue; Please press 'n' to exit: "); 
			ch = new Scanner(System.in).next().charAt(0);
		}
		
	}

	// This method will accept an integer reverse the digits and Print 
	public static void reverseInt(int num)
	{
		
		int temp, c, reverse =0;
		temp = num;
		
		while(num>0)
		{
			c =  num % 10;
			num = num/ 10;
			reverse = reverse * 10 + c;
		}
		System.out.println("The Reversed number is : " + reverse);
	}
}
