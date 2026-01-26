// Write a Java Program to implement the Calculation of Sin, Cos and Tan of a
// given degree
// using Threading. Use Start and Join Methods.

class SinThread extends Thread{
    double degree;

    SinThread(double degree){
        this.degree = degree;
    }

    public void run(){
        double rad = Math.toRadians(degree);
        System.out.println("Sin = "+Math.sin(rad));
    }
}

class CosThread extends Thread{
    double degree;

    CosThread(double degree){
        this.degree = degree;
    }

    public void run(){
        double rad = Math.toRadians(degree);
        System.out.println("Cos = "+Math.cos(rad));
    }
}

class TanThread extends Thread{
    double degree;

    TanThread(double degree){
        this.degree = degree;
    }

    public void run(){
        double rad = Math.toRadians(degree);
        System.out.println("Tan = "+Math.tan(rad));
    }
}

public class MathThread{
    public static void main(String args[]){
        double degree = 45;

        SinThread t1 = new SinThread(degree);
        CosThread t2 = new CosThread(degree);
        TanThread t3 = new TanThread(degree);

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(Exception e) {}

        System.out.println("All Done!");
    }
}
