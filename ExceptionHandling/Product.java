// Write a java program to accept the details of product as productcode, productname and
// weight. If weight > 100 then throw an exception as InvalidProduct Exception and give
// the proper message. Otherwise display the product details. Define required exception
// class.

import java.util.*;

class InvalidProductException extends Exception{
    public InvalidProductException(String msg){
        super(msg);
    }
}

public class Product{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        try{
            System.out.println("Enter Product code: ");
            int productCode = sc.nextInt(); 

            System.out.println("Enter Product name: ");
            String productName = sc.next(); 

            System.out.println("Enter Product weight: ");
            int weight = sc.nextInt(); 

            if(weight > 100){
                throw new InvalidProductException("Weight cannot be greater than 100!");
            }

            System.out.println();
            System.out.println("--Product Details--");
            System.out.println("Product code: "+productCode);
            System.out.println("Product name: "+productName);
            System.out.println("Weight: "+weight);
        
        }catch(InvalidProductException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
