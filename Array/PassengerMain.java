// Create a class Passenger. Accept details of 10 passengers using an array of objects and display the accepted details (assume suitable attribute fields).
import java.util.*;

class Passenger{
    String name;
    int age;
    String gender;
    String contactno;
    String source;
    String destination;

    void accept(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Passanger Name: ");
        name = sc.nextLine();

        System.out.println("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Gender: ");
        gender = sc.nextLine();

        System.out.println("Enter ContactNo: ");
        contactno = sc.nextLine();

        System.out.println("Enter Source: ");
        source = sc.nextLine();

        System.out.println("Enter Destination: ");
        destination = sc.nextLine();
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("ContactNo: "+contactno);
        System.out.println("Source: "+source);
        System.out.println("Destination: "+destination);
        System.out.println("------");
    }
}

public class PassengerMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Passenger[] pass = new Passenger[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Enter details of Passenger "+(i+1));
            pass[i] = new Passenger();
            pass[i].accept();
        }

        System.out.println();
        System.out.println("---Passenger Details---");
        for(int i = 0; i < 3; i++){
            pass[i].display();
        }
    }
}
