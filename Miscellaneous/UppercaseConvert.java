/*
 Write a program which converts all lowercase letter in a sentence to uppercase.

For. Ex:

1) Consider a sentence "welcome to Programr!"
its uppercase conversion is "WELCOME TO PROGRAMR!"

2) If user inputs string like "I am a new user of Programr!"
it should print "I AM A NEW USER OF PROGRAMR!"
 */

import java.util.Scanner;

public class UppercaseConvert 
{
	public static void main(String args[])
	{
		System.out.print("Please enter a sentence to convert to uppercase: ");
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		
		System.out.println(input.toUpperCase());
		
		scan.close();
	}
}