// Ex 1-  Program to display file contents in upper case 

import java.io.*;

class DisplayConInUpperCase{
	public static void main(String args[]) throws FileNotFoundException, IOException
	{
		FileInputStream fi = new FileInputStream("E:\\Github2026\\Core-Java\\File Handling\\pqr.txt");

		int n;
		char ch;

		while((n = fi.read()) != -1)
		{
			ch=(char)n;
			System.out.print(Character.toUpperCase(ch));
		}

		fi.close();
	}
}
