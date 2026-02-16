import java.io.*;

public class ExceptionExample2{
    public static void main(String args[]){
        int d, a;

        try{
            d = 0;
            a = 42 / d;
            System.out.println("This will be printed Y/N ");
            System.out.println("Hiiiii");
        }
        catch(ArithmeticException e){
            System.out.println("Catched error division by zero: "+e);
        }
        System.out.println("After Catch this will be executed Y/N");
    }
}
