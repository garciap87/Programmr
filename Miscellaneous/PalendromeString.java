/*
 Write a program which takes input as string and check if it is palindrome 
 or not.If the string and the reverse of string are same then we say string 
 is palindrome. If string is "level" then the output should be: palindrome

If string is "helloworld" then the output should be: not a palindrome 
*/

import java.util.*;

public class PalendromeString 
{
	public static void main(String args[])
	{
		System.out.print("Please enter a string to check if its a palendrome: ");
		Scanner input = new Scanner(System.in);
		if(palendrome(input.nextLine()))
		{
			System.out.print("True");
		}
		else
		{
			System.out.print("False");
		}
		input.close();
	}
	
	public static boolean palendrome(String input)
	{
		System.out.print("Is the string a palendrome? - ");
		return input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
	}
}