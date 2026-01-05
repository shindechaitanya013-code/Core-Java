import java.util.Scanner;

public class ArithmaticOp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Sum = "+(a+b));
        System.out.println("Subtraction = "+(a-b));
        System.out.println("Multiplication = "+(a*b));
        System.out.println("Division = "+(a*b));
        System.out.println("Remainder = "+(a%b));
    }
}
