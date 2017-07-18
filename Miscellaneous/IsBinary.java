/*
A binary number is written as combination of 1's and 0's.
Binary number 100 indicates 4.

Write a program which accepts a number and prints whether it is binary or not.

For Ex:

1) if user inputs 1040400
then it should print "Not Binary".

2) if user inputs 1000100
then it should print "Binary".
 */

import java.util.Scanner;

public class IsBinary 
{
	public static void main(String args[])
	{
		System.out.print("Please enter a number to check if its a binary number: ");
		Scanner input = new Scanner(System.in);
		if(binary(input.nextInt()))
		{
			System.out.print("True");
		}
		else
		{
			System.out.print("False");
		}
		input.close();
	}
	
	public static boolean binary(int input)
	{
		System.out.print("Is the input binary? - ");
		
		/*If you divide a number by 10 e.g. number/10, you reduce one digit from 
		it and if you use remainder operator e.g. number%10 then you will get last 
		digit of number. For example 1234/10 will return 123 which means last digit 
		4 is removed and 1234%10 will return 4, which is the last digit.
		*/

		while(input != 0) 
		{
			if(input % 10 > 1|| input % 10 < 0)
			{
				return false;
			}
			
			input /= 10;
		}
		
		return true;
	}
}