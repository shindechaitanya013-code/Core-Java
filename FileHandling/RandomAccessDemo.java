import java.io.*;

class RandomAccessDemo{
	public static void main(String args[])
	{
		//RandomAccessFile rf = null;
		try{
			RandomAccessFile rf = new RandomAccessFile("E:\\Github2026\\Core-Java\\File Handling\\oop.txt","rw");
				rf.writeInt(3);
				rf.writeChar('Z');

				rf.writeInt(6);
				rf.writeChar('P');

				for(int i=0;i<rf.length()-1;i++)
				{
					if((i%2)==0)
					{ 
						rf.seek(0);
						while(rf.getFilePointer() < rf.length()){
							int a = rf.readInt();
							System.out.println("Entered integer is: " + a);

							char c = rf.readChar();
							System.out.println("Entered Character is: " + c);
						}	
					}
				}
				rf.close();
		}
		catch(FileNotFoundException e1)
		{
			System.out.println("File Not Found"+e1);
		}

		catch(IOException e2)
		{
			System.out.println("File Error"+e2);
		}
	}
}
