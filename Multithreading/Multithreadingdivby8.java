class Thread_bivby8 extends Thread
{
    @Override
    public void run() 
    {
        for(int i = 1; i < 100; i++)
        {
            if(i % 8 == 0)
            {
                System.out.printf("\nNo is: %d", i);
            }
        }
        System.out.printf("\nThread 1 finished");
    }
}

public class Multithreadingdivby8 
{
    public static void main(String[] args) 
    {
        Thread_bivby8 t1 = new Thread_bivby8();
        t1.start();
    }
}
