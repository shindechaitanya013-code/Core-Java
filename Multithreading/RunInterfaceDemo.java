class NewThread implements Runnable{
    String name;
    Thread t;

    NewThread(){
        t = new Thread(this,"demoRunnableThread");
        System.out.println("Child Thread: "+t);
        t.start();
    }

    public void run(){
        try{
            for(int i=5; i>0; i--){
                System.out.println("Child Thread: "+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Child Thread Interrupted");
        }

        System.out.println("Exiting Child Thread");
    }
}


public class RunInterfaceDemo {
    public static void main(String args[]){
        new NewThread();

        try{
            for(int i=25; i>0; i--){
                Thread.sleep(1000);
                System.out.println("Main Thread: "+i);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }

        System.out.println("Main Thread Exiting");
    }
}
