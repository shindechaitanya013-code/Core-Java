import java.io.*;

class HelloName
{
	public static void main(String args[]) throws IOException	// Any Input is in read as a String in Java
	{
		System.out.println("Enter your name: ");

		InputStreamReader reader = new InputStreamReader(System.in);	// Acccept String Input From Keyboard
		BufferedReader in = new BufferedReader (reader);				// Buffers the String Input
		
        String name = in.readLine();				// String DataType
		System.out.println("Your name is: " + name);
	}
}
