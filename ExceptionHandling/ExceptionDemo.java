import java.util.*;

public class ExceptionDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        try{   
            System.out.println("Enter first number: ");
            int a = sc.nextInt();

            System.out.println("Enter second number: ");
            int b = sc.nextInt();

            int c = a / b;
            System.out.println("Result: "+c);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        }
    }
}
