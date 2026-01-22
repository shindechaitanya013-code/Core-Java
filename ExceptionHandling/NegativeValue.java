// Write a java program to create own exception for Negative Value Exception if the user enter
// negative value.

import java.util.*;

class NegativeValueException extends Exception{
    public NegativeValueException(String msg){
        super(msg);
    }
}

public class NegativeValue{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter a positive number: ");
            int no = sc.nextInt();

            if(no < 0){
                throw new NegativeValueException("Negative value entered! Please enter a positive number.");
            }

            System.out.println("You entered: "+no);
        }catch(NegativeValueException e){
            System.out.println("Exception caught: "+e.getMessage());
        }
    }
}
