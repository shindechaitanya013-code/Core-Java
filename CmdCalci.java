import java.io.*;

public class CmdCalci {
    public static void main(String args[]){

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        char op = args[2].charAt(0);

        switch(op){
            case '+':
                    System.out.println("Addition: "+(num1 + num2));
                    break;
            case '-':
                    System.out.println("Subtraction: "+(num1 - num2));
                    break;
            // case '*':
            //         System.out.println("Multiplication: "+(num1 * num2));
            //         break;
            case '/':
                    System.out.println("Division: "+(num1 / num2));
                    break;

            default:
                    System.out.println("Invalid Operator");
        }
    }
}

//IN command line operator * is not work bcz it is a special wildcard character
