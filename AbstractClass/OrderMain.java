// Create an abstract class Order having members id and description. Create two subclasses PurchaseOrder and SalesOrder with member customer name and vendor name respectively. Define methods accept and display in all classes. Create 5 objects each of PurchaseOrder and SalesOrder. Accept and display the details.
import java.util.*;

abstract class Order{
    int id;
    String description;

    abstract void accept();
    abstract void display();
}

class PurchaseOrder extends Order{
    String customerName;
    
    Scanner sc = new Scanner(System.in);

    void accept(){
        System.out.println("Enter Order ID: ");
        id  = sc.nextInt();

        System.out.println("Enter Description: ");
        description = sc.next();

        System.out.println("Enter Customer Name: ");
        customerName = sc.next();
    } 

    void display(){
        System.out.println("Order ID: "+id);
        System.out.println("Description: "+description);
        System.out.println("Customer Name: "+customerName);
        System.out.println();
    }
}

class SalesOrder extends Order{
    String vendorName;

    Scanner sc = new Scanner(System.in);

    void accept(){
        System.out.println("Enter Order ID: ");
        id = sc.nextInt();

        System.out.println("Enter Description: ");
        description = sc.next();

        System.out.println("Enter Vendor Name: ");
        vendorName = sc.next();
    }

    void display(){
        System.out.println("Order ID: "+id);
        System.out.println("Description: "+description);
        System.out.println("Vendor Name: "+vendorName);
        System.out.println();
    }
}

public class OrderMain{
    public static void main(String args[]){

        PurchaseOrder[] pr = new PurchaseOrder[5];
        SalesOrder[] se = new SalesOrder[5];

        System.out.println("Enter puchase order details: ");
        for(int i = 0; i < 5; i++){
            pr[i] = new PurchaseOrder();
            pr[i].accept();
        }

        System.out.println("Enter sales order details: ");
        for(int i = 0; i < 5; i++){
            se[i] = new SalesOrder();
            se[i].accept();
        }

        System.out.println();
        System.out.println("Displaying Purchase Order");
        for(int i = 0; i < 5; i++){
            pr[i].display();
        }

        System.out.println();
        System.out.println("Displaying Sales Order");
        for(int i = 0; i < 5; i++){
            se[i].display();
        }
    }
}
