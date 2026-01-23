// Write a Java program to accept email address of a user and throw a user defined
// exception InvalidEmailException if it starts with digit or does not contain @ symbol.

import java.util.Scanner;

class emailexc extends Exception{
   	emailexc(String msg)
   	{
		super(msg);
 	}
}

public class EmailException{

    static void acceptemail() throws emailexc
    {
       	String email;

        Scanner sc = new Scanner(System.in);

        System.out.printf("\n Enter Email:");
        email = sc.next();
        
        if(Character.isDigit(email.charAt(0))){
            throw new emailexc("Email cannot starts with digit");
        }
        else
        {
            if(email.contains("@")){
                System.out.printf(email);
            }
           	else{
                throw new emailexc("Email should contain @ symbol");
           	}
       	}
    }
    public static void main(String[] args){
        try{
            acceptemail();
       	} 
		catch (emailexc e1){
            e1.printStackTrace();
        }
   	 }
}

