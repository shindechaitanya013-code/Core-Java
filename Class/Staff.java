// Define class Staff with data members as name, birth-date, designation and
// salary. Use constructors and method display () –which will display details of
// Staff. Create two objects of Staff and Print the name of staff having highest
// salary.

import java.util.*;

class Staff{
    String name;
    String birthdate;
    String designation;
    float salary;

    Staff(String name, String birthdate, String designation, float salary){
        this.name = name;
        this.birthdate = birthdate;
        this.designation = designation;
        this.salary = salary;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Birth-Date: "+birthdate);
        System.out.println("Destination: "+designation);
        System.out.println("Salary: "+salary);
        System.out.println();
    }

    public static void main(String args[]){
        Staff s1 = new Staff("ABC", "12-05-2000", "Manager", 45000.00f);
        Staff s2 = new Staff("XYZ", "15-02-2002", "Developer", 60000.00f);

        s1.display();
        s2.display();

        if(s1.salary > s2.salary){
            System.out.println("Staff with highest salary: "+s1.name);
        }else{
            System.out.println("Staff with highest salary: "+s2.name);
        }
    }
}
