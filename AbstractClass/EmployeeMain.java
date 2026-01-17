// Create an abstract class Employee. Derive two classes Manager and Worker from it. Use proper methods to accept and display the details. The fields of Manager are mid, mname, and phno. Similarly, the fields of Worker are name and working hours.
import java.util.*;

abstract class Employee{
    abstract void accept();
    abstract void display();
}

class Manager extends Employee{
    int mid;
    String mname;
    String phno;

    Scanner sc = new Scanner(System.in);

    void accept(){
        System.out.println("Enter Manager ID: ");
        mid = sc.nextInt();

        System.out.println("Enter Manager Name: ");
        mname = sc.next();

        System.out.println("Enter Manager Phone no: ");
        phno = sc.next();
    }

    void display(){
        System.out.println();
        System.out.println("---Manager Details---");
        System.out.println("Manager ID: "+mid);
        System.out.println("Manager Name: "+mname);
        System.out.println("Manager phno: "+phno);
    }
}

class Worker extends Employee{
    String name;
    int WorkingHours;

    Scanner sc = new Scanner(System.in);

    void accept(){
        System.out.println();
        System.out.println("Enter Worker Name: ");
        name = sc.nextLine();

        System.out.println("Enter Worker Working Hours: ");
        WorkingHours = sc.nextInt();
    }

    void display(){
        System.out.println();
        System.out.println("---Worker Details---");
        System.out.println("Worker Name: "+name);
        System.out.println("Working Hours: "+WorkingHours);
    }
}

public class EmployeeMain{
    public static void main(String args[]){
        Manager m = new Manager();
        Worker w = new Worker();

        m.accept();
        w.accept();

        m.display();
        w.display();
    }
}
