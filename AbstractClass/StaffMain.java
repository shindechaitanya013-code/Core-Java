// Write abstract class Staff with abstract method calculateSalary() and instance method InitData(int no, String name).
// Write Typist class as subclass of Staff with speed as instance variable. If speed is less than 40, then salary = 4000, else 5000.
// Write main class to implement above classes.

abstract class Staff{
    int no;
    String name;

    void InitData(int no, String name){
        this.no = no;
        this.name = name;
    }

    abstract void calculateSalary();
}

class typist extends Staff{
    int speed;
    int salary;

    typist(int no, String name, int speed){
        InitData(no,name);
        this.speed = speed;
    }

    void calculateSalary(){
        if (speed < 40)
            salary = 4000;
        else
            salary = 5000;
    }

    void display(){
        System.out.println("\n--Typist Deatails--");
        System.out.println("Number: "+no);
        System.out.println("Name: "+name);
        System.out.println("speed: "+speed);
        System.out.println("Salary: "+salary);  
    }
}

public class StaffMain{
    public static void main(String args[]){
        typist  t1 = new typist(101, "Rahul", 30);
        typist  t2 = new typist(102, "Om", 80);

        t1.calculateSalary();
        t1.display();

        t2.calculateSalary();
        t2.display();
    }
}
