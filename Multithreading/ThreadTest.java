class A extends Thread{
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println("\tFrom Thread A : i = "+i);
        }
    }
}

class B extends Thread{
    public void run(){
        for(int j=0; j<=5; j++){
            System.out.println("\tFrom Thread B : j = "+j);
        }
    }
}

class C extends Thread{
    public void run(){
        for(int k=0; k<=5; k++){
            System.out.println("\t From Thread C : k = "+k);
        }
    }
}

public class ThreadTest{
    public static void main(String args[]){
        try{
            A threadA = new A();
            threadA.start();
            B threadB = new B();
            threadB.start();
            C threadC = new C();
            threadC.start(); 
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
