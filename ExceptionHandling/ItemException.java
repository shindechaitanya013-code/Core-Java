import java.util.Scanner;

class QuantityException extends Exception{
    QuantityException(String s){
        super(s);
    }
}

class PriceException extends Exception{
    PriceException(String s){
        super(s);
    }
}

class Item 
{
    String ItemCode, description;
    int quantity, rate;
    Scanner sc = new Scanner(System.in);

    void userdefined(int quantity, int price) throws QuantityException, PriceException 
    {
        if(quantity <= 0){
            throw new QuantityException("Quantity should be greater than 0");
        }
        
        if(price <= 0){
            throw new PriceException("Price should be greater than 0");
        }
    }

    Item()
    {
        System.out.println("\nEnter Item Code:");
        ItemCode = sc.next();

        System.out.println("Enter Description:");
        description = sc.next();

        try
        {
            System.out.println("Enter Quantity:");
            quantity = sc.nextInt();

            System.out.println("Enter Price:");
            rate = sc.nextInt();

            userdefined(quantity, rate);
        }
        catch (QuantityException e) 
        {
            System.out.println(e.getMessage());
            quantity = 1;   // default value
        } 
        catch (PriceException e) 
        {
            System.out.println(e.getMessage());
            rate = 1;      // default value
        }
    }

    void display()
    {
        System.out.println("\nItem Code: " + ItemCode);
        System.out.println("Description: " + description);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + rate);
    }
}

public class ItemException
{
    public static void main(String args[])
    {
        Item item[] = new Item[4];

        for(int i=0;i<4;i++)
        {
            item[i] = new Item();
        }

        System.out.println("\nItem Details:");

        for(int i=0;i<4;i++)
        {
            item[i].display();
        }
    }
}
