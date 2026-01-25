// Write a multithreaded Java program to demonstrate the following threads:
// a) Display all numbers divisible by 8 from 1 to 100
// b) Display all even numbers between 51 and 100
// c) Display the message "Java is Awesome" 10 times

class DivisibleBy8 extends Thread{
    public void run(){
        System.out.println("Numbers divisible by 8 are: ");
        for(int i = 1; i <= 100; i++){
            if(i % 8 == 0){
                System.out.println(i);
            }
        }
    }
}

class EvenNumbers extends Thread{
    public void run(){
        System.out.println("Even numbers from 51 to 100 are: ");
        for(int i = 51; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }   
}

class Message extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Java is Awesome");
        }
    }
}

public class MultiThreadDemo{
    public static void main(String args[]){
        DivisibleBy8 t1 = new DivisibleBy8();
        EvenNumbers t2 = new EvenNumbers();
        Message t3 = new Message();

        t1.start();
        t2.start();
        t3.start();
    }
}
