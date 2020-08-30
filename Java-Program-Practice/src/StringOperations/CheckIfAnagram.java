package StringOperations;

import java.util.Arrays;
import java.util.Scanner;

//This program checks if two Strings are anagrams or not
// two String is called anagram, if they contains the same characters but on different order e.g. army and mary
// @author Ananda
public class CheckIfAnagram {
	
	public static void main(String[] args) 
	{
		Scanner inputStr = null;
		String secondWord, firstWord = "";
		Boolean ifAnagram = false;
		
		
		//Take input of the first Word
		System.out.print("Enter the first string :");
        inputStr = new Scanner(System.in);
        
        firstWord = inputStr.nextLine();
        //Take input of the second Word
        System.out.print("Enter the first string :");
        inputStr = new Scanner(System.in);
        
        secondWord = inputStr.nextLine();
		
        //Convert the Arrays to Character Array
		char[] charFromWord = firstWord.toCharArray(); 
		char[] charFromAnagram = secondWord.toCharArray();
		// Sort the two Character Arrays
		Arrays.sort(charFromWord); 
		Arrays.sort(charFromAnagram); 
		
		//The Two Words are Anagram if the two Char Arrays are equal , otherwose not
		if(Arrays.equals(charFromWord, charFromAnagram))
		{
			System.out.println("The two words are Anagram to each other");
		}

		else
		{
			System.out.println("The two words are not Anagram to each other");
		}
		

	}

}
