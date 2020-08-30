package StringOperations;

import java.util.Scanner;

public class CheckIfPalindrome {

	public static void main(String[] args) {
		
		
		String originalStr , reverseStr = "";
		
		System.out.print("Enter the string you want to check whether a Palindrome:");
        Scanner inputStr = new Scanner(System.in);
        
        originalStr = inputStr.nextLine();
        
        int n = originalStr.length();
        for(int i = n - 1; i >= 0; i--)
        {
        	reverseStr = reverseStr + originalStr.charAt(i);
        }
        
        if(originalStr.equalsIgnoreCase(reverseStr))
        {
            System.out.println("Entered string is a palindrome.");
        }
        else
        {
            System.out.println("Entered string is not a palindrome.");
        }

	}

}
