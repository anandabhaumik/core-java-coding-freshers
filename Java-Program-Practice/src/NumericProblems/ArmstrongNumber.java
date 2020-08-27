package NumericProblems;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{	
		int number =0;
		//input a number to examine whether Prime or Not 
		System.out.println("Enter a number to check whether it is an Armstrong Number or not: "); 
		number = new Scanner(System.in).nextInt();
		
		checkArmstrongNumber(number);
	}

	public static void checkArmstrongNumber(int num) 
	{
		int c, checkArm = 0;
		int temp= 0;
		temp = num;
		
		while(num >0)
		{
			c = num% 10;
			checkArm  = checkArm + (int)Math.pow(c,3);
			num = num/10;
		}
		
		if (temp == checkArm)
		{
			System.out.println("The number " + temp + " is an Armstrong Number" );
		}
		
		else 
		{
			System.out.println("The number " + temp + " is not an Armstrong Number" );
		}
		
		
	}
	
}
