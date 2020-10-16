import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    int Art = 0;
	    int Bob = 0;
	    int Cal = 0;
	    int Dan = 0;
	    int Eli = 0;
	    
	    Scanner s = new Scanner(System.in);
	    
		System.out.print("Enter points earns by Art: ");
		Art = s.nextInt();
		
		System.out.print("Enter points earns by Bob: ");
		Bob = s.nextInt();
		
		System.out.print("Enter points earns by Cal: ");
		Cal = s.nextInt();
		
		System.out.print("Enter points earns by Dan: ");
		Dan = s.nextInt();
		
		System.out.print("Enter points earns by Eli: ");
		Eli = s.nextInt();
		
		System.out.println();
		
		System.out.println("Points for game ");
		
		System.out.print("Art:  ");
		for (int a = 0; a < Art; a++ )
		{
		    System.out.print("*");
		}
		System.out.println();
		
		System.out.print("Bob:  ");
		for (int a = 0; a < Bob; a++ )
		{
		    System.out.print("*");
		}
		System.out.println();
		
		System.out.print("Cal:  ");
		for (int a = 0; a < Cal; a++ )
		{
		    System.out.print("*");
		}
		System.out.println();
		
		System.out.print("Dan:  ");
		for (int a = 0; a < Dan; a++ )
		{
		    System.out.print("*");
		}
		System.out.println();
		
		System.out.print("Eli:  ");
		for (int a = 0; a < Eli; a++ )
		{
		    System.out.print("*");
		}
		System.out.println();
		
	}
}
