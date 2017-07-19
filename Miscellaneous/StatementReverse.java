/*
 Complete the following program of statement reverse. Program will take
string as a input and will print it in reverse form like given below:

example1:
Enter the Statement:
this is programr
Reverse is:
programr is this

example2:
Enter the Statement:
my name is ABC
Reverse is:
ABC is name my
 */
import java.util.Scanner;

public class StatementReverse 
{
	public static void main(String[] args) 
	{
		System.out.print("Please enter your statement: ");
		Scanner scan = new Scanner (System.in);
		String sentence = scan.nextLine();
		
		String []reverse = sentence.split(" ");
		String reversedSentence="";
		
		for(int i = reverse.length -1; i >= 0; i--)
		{
			reversedSentence += reverse[i];
			reversedSentence += " ";
		}
		
		System.out.print("The Reverse is: " + reversedSentence);
		scan.close();
	}
}