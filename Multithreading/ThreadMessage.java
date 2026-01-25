// Write a Java program that creates three threads. First thread displays “Hello!”
// every one second, the second thread displays “Wear Mask !” every two seconds
// and “Use Sanitizer !” every 5 seconds.

class HelloThread extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("Hello");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class MaskThread extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("Wear Mask!");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class SanitizerThread extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("Use Sanitizer!");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class ThreadMessage{
    public static void main(String args[]){
        HelloThread h1 = new HelloThread();
        h1.start();

        MaskThread m1 = new MaskThread();
        m1.start();

        SanitizerThread s1 = new SanitizerThread();
        s1.start();
    }
}
