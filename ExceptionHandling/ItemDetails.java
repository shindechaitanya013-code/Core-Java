// Write an application that will accept details of items such as items such as itemcode,
// description, quantity and rate.
// Accept details of 5 different items in an array of objects.
// Fire user defined exception << QuantityException >> and << PriceException >> if
// quantity or price is less than or equal to zero.
// Display the accepted 5 different items details on console if there is no any error arise

import java.util.*;

class QuantityException extends Exception{
    public QuantityException(String message){
        super(message);
    }
}

class PriceException extends Exception{
    public PriceException(String message){
        super(message);
    }
}

class Item{
    int itemCode;
    String description;
    int quantity;
    int rate;

    Item(int itemCode, String description, int quantity, int rate) throws QuantityException, PriceException{
        if (quantity <= 0){
            throw new QuantityException("Quantity can not be leass than or equal to zero!!");
        }
        if (rate <= 0){
            throw new PriceException("Price can not be leass than or equal to zero!!");
        }

        this.itemCode = itemCode;
        this.description = description;
        this.quantity = quantity;
        this.rate = rate;
    }

    void display(){
        System.out.println("Item Code: "+itemCode);
        System.out.println("Description: "+description);
        System.out.println("Quantity: "+quantity);
        System.out.println("Rate: "+rate);
        System.out.println("---------------");
    }
}

public class ItemDetails{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Item[] items = new Item[5];

        try{
            for(int i=0; i<5; i++){
                System.out.println("Enter details of item "+(i+1));
                System.out.println("Enter Item Code: ");
                int code = sc.nextInt();

                System.out.println("Enter Item Description: ");
                String des = sc.next();

                System.out.println("Enter Item Quantity: ");
                int qua = sc.nextInt();

                System.out.println("Enter Item Rate: ");
                int rate = sc.nextInt();

                items[i] = new Item(code, des, qua, rate);
            }

            System.out.println("---Item Details---");
            for(Item item : items){
                item.display();  
            }
        }
        catch(QuantityException | PriceException e){
                System.out.println("Error: " +e.getMessage());
        }
    }
}
