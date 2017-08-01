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
	   //Create a counter flag
      int count = 0;
      
      //Loop starts at min and goe up to the max
      for(int i = min; i <= max; i++)
      {
    	  //converts int to a string
    	  String number = String.valueOf(i);
    	  
    	  //Checks to see if the current number still has a one in it
    	  while(number.contains("1"))
    	  {
    		  //it returns the location of the first occurrence of the specified character
    		  int num = number.indexOf("1");
    		  //creates a new string starting at the specified index and extends to the end of this string.
    		  number = number.substring(num + 1);
    		  count++;
    	  }
      }
      System.out.println("The total number of 1s are: " + count);
   }
}