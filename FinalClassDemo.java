// A class that declared as final cannot be extended and method in such class cannot be overridden
import java.io.*;

final class Shape2D{
    void display(){
        System.out.println("Welcome to 2D Shape");
    }
}

class Triangle extends Shape2D{
    void display(){
        System.out.println("Welcome to Triangle Environment");
    }
}

class FinalClassDemo{
    public static void main(String args[]){
        Triangle t2 = new Triangle();
        t2.display();
    }
}
