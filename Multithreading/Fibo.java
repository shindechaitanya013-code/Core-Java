// Write an application that will create following threads:
// -- Which will print A to Z 50 times ?
// -- And 15 – terms of Fibonacci Series

class PrintAlphabets extends Thread{
    public void run(){
        System.out.println("Print A to Z 50 times: ");
        for(int i = 1; i <=50; i++){
            for(char c = 'A'; c <= 'Z'; c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

class FibonacciSeries extends Thread{
    public void run(){
        int a = 0, b = 1, c;
        System.out.println("First 15 terms of fibonacci series: ");
        System.out.println(a+ " "+b+ " ");

        for(int i = 3; i <= 15; i++){
            c = a + b;
            System.out.println(c+ " ");
            a = b;
            b = c;
        }
        System.out.println();
    }
}

public class Fibo {
    public static void main(String args[]){
        PrintAlphabets p1 = new PrintAlphabets();
        FibonacciSeries f1 = new FibonacciSeries();

        p1.start();

        try{
            p1.join();
        }catch(Exception e){
            System.out.println(e);
        }

        f1.start();
    }
}
