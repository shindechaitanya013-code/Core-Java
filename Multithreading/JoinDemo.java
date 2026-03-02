
class NewThread implements Runnable{
    String name;
    Thread t;

    NewThread(String threadname){
        name = threadname;
        t = new Thread(this, name);

        System.out.println("New Thread: "+t);
        t.start();
    }

    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println(name+ ": "+i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e){
            System.out.println(name+ "Interrupted");
        }
        System.out.println("exit from: "+name);
    }
}

class JoinDemo{
    public static void main(String args[]){
        NewThread n1 = new NewThread("First");
        NewThread n2 = new NewThread("Second");
        NewThread n3 = new NewThread("Last");

        System.out.println("First Thread is alive: "+n1.t.isAlive());
        System.out.println("Second Thread is alive: "+n2.t.isAlive());
        System.out.println("Third Thread is alive: "+n3.t.isAlive());

        try{
            System.out.println("Waiting for the other thread to finish");
            n1.t.join();
            n2.t.join();
            n3.t.join();
        }
        catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }

        System.out.println("First Thread is alive: "+n1.t.isAlive());
        System.out.println("Second Thread is alive: "+n2.t.isAlive());
        System.out.println("Third Thread is alive: "+n3.t.isAlive());

        System.out.println("Main Thread exiting...");
    }
}
