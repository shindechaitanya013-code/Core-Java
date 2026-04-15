import java.io.*;

class ThreadExampleSynch implements Runnable
{
	class_A obj1;
	Thread t;

	ThreadExampleSynch(class_A c)	
	{
		obj1=c;
		t=new Thread(this);
	}

	public void run()
	{
		synchronized(obj1)
		{
			obj1.printValue();
		}
	}
	public static void main(String args[])
	{
		class_A ca = new class_A();
		ThreadExampleSynch one = new ThreadExampleSynch(ca);
		one.t.start();
		ThreadExampleSynch two = new ThreadExampleSynch(ca);
		two.t.start();
		ThreadExampleSynch three = new ThreadExampleSynch(ca);
		three.t.start();
	}
}

class class_A 
{
	void printValue()
	{
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(i+" ");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
