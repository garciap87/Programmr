/*
 Two string arrays are given one is for names and other is for equivalent 
 surnames of the celebrities. program will just take the name as a input 
 then find out the corresponding last name and the then print the whole name.
 
Scenario:
Enter the name:
harry

Full name of the celebraty is:
harry potter
 */
import java.io.*;
import java.util.Scanner;

public class NameSearch
{
	public static String names[]={"harry","michael","will","tom","jackie"};    
    public static String surnames[]={"potter","jackson","smith","cruise","chan"};    

    public static void main(String a[]) throws Exception
	{
    	System.out.print("Enter the name: ");
        Scanner sc=new Scanner(System.in); 
        String firstName = sc.next();
        boolean found = false;
        
        for(int i = 0; i < names.length; i++)
        {
        	if(firstName.equalsIgnoreCase(names[i]))
        	{
        		System.out.print("Full name of the celebraty is: " + names[i] + " " + surnames[i]);
        		found = true;
        		break;
        	}	
        }
        if(!found)
        {
        	System.out.println("Name was not a match");
        }
    }
}  