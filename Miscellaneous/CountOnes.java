/*
Write a program which accepts two integers as a minimum and maximum limit and
 calculates total of how many 1s were their within the limit.
 
For ex:
1) if user input 1 11 then it should print 4.
 
2) if user input 11 111 then it should print 34.
*/
 
import java.util.Scanner;
public class CountOnes
{
   public static void main(String[] args)
   {
      System.out.print("Please enter your min and max values: ");
      Scanner scanner = new Scanner(System.in);
     
      totalOnes(scanner.nextInt(), scanner.nextInt());
      scanner.close();
   }
 
   public static void totalOnes(int min, int max)
   {
      int count = 0;
      
      for(int i = min; i <= max; i++)
      {
    	  String number = String.valueOf(i);
    	  while(number.contains("1"))
    	  {
    		  number = number.substring(number.indexOf("1") + 1);
    		  count++;
    	  }
      }
      System.out.println("The total number of 1s are: " + count);
   }
}