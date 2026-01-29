//Ex 2-  Program to illustrate the use of Filereader class 

import java.io.*;

public class FileReaderDemo{
	public static void main(String args[])throws FileNotFoundException,IOException{
		try
		{
		   FileReader fr = new FileReader("E:\\Github2026\\Core-Java\\File Handling\\obc.txt");

		   int i;
		   while((i = fr.read()) != -1)
		   {
			System.out.print((char)i);
		   }
		   fr.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception : "+e);
		}

	}
}
