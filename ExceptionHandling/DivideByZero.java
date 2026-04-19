import java.io.*;

public class DivideByZero
{	
	public static void main (String args[])
	{
		int a = 10, b = 5, c = 5;
		int d = 0;

		try
		{
			d = a / (b - c);   // This will cause division by zero
			System.out.println("d = " + d);
		}
		catch (ArithmeticException e)
		{
			System.out.println("It leads to division by zero error: " + e);
		}

		System.out.println("Program continues after exception handling...");
	}
}
