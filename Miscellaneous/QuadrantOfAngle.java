/*
 A very simple challenge.

Write a program which accepts an Integer which is an Angle and 
prints the Quadrant number in which it is.

For Ex.
1) if user input 30 then it should print 1.
2) if user input 197 then it should print 3.
 */

import java.util.Scanner;

public class QuadrantOfAngle
{
   public static void main (String[] args)
   {
      
      int angle = 0;
      System.out.print("Type an integer angle (in degrees) and press Enter: ");
      Scanner sc = new Scanner(System.in);
      angle= sc.nextInt();

        int quadrant = 0;

        if(angle >= 0 && angle <=90)
        {
            quadrant = 1;
        }
        else if(angle >90 && angle <=180)
        {
            quadrant = 2;
        }
        else if(angle >180 && angle <=270)
        {
            quadrant = 3;
        }
        else if(angle >270 && angle <=360)
        {
            quadrant = 4;
        }

      // output
      System.out.println("Quadrant is: " + quadrant);
      sc.close();  
   }
} 