/*
 Write a program which takes inputs of length and width of rectangle as integer and print the rectangle.

Example:
1.If width = 10 and height = 5 then the rectangle is :

**********
*        *
*        *
*        *
**********

1.If width = 15 and height = 10 then the rectangle is :

***************
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
*                  *
***************
 */

import java.util.Scanner;

public class PrintRectangle 
{
	public static void main(String[] args)
	{
		int w = 1;
		
		System.out.print("Please enter the width of a rectangle: ");
		Scanner scanner = new Scanner(System.in);
		int width = scanner.nextInt();
		System.out.print("Please enter the height of the rectangle: ");
		int height = scanner.nextInt();
		System.out.println("If width = " + width + " and height = " + height + " then the rectangle is : ");
		
		//The value of i is checked for 1 minus the height so an extra row isn't printed
		for(int i = 1; i < height; i++)
		{
			//check to see if the height is on the first or last row if it is print width
			if(i == 1 || i == height - 1)
			{
				//Go one past the width to get the entire width and not one less
				while(w != width + 1)
				{
					System.out.print("*");
					w++;
				}
				//Reset counter for next pass
				w=1;
				//Move the cursor down a line
				System.out.println("");
			}
			//Check to see if your on the last row, if you are print width
			if(i != height -1)
			{
				System.out.println("*    *");
			}
		}	
		scanner.close();
	}
}