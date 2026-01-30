import java.io.*;

class PrintWriterDemo{
	public static void main(String args[]) throws Exception{
		try
		{
			PrintWriter pw = new PrintWriter("E:\\Github2026\\Core-Java\\File Handling\\obc.txt");
			pw.println(true);
			pw.println('A');
			pw.println(1500);
			pw.println(54.29);
			pw.println("Dr.C.Kulkarni");
			pw.close();
		}
		catch(Exception e)
		{
			System.out.println("Caught Exception::"+e);
		}
	}
}
