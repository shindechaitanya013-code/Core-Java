// Write a java program to define INTERFACe CalculateResult with methods
// CalculateTotal(),CalculatePercentage(), CalculateGrade();
// Define a Class Student which implements this interface and has appropriate method
// definition/ overriding for this.
// Take details of n students with array of objects and display the result and if marks less
// than zero fire User defined Exception << ZeroMarksException >>

import java.util.*;

// User-defined Exception
class ZeroMarksException extends Exception{
    public ZeroMarksException(String msg){
        super(msg);
    }
}

// Interface declaration
interface CalculateResult{
    void CalculateTotal();
    void CalculatePercentage();
    void CalculateGrade();
}

// Student class implementing the interface
class Student implements CalculateResult{
    String name;

    int marks[] = new int[3];

    int total;
    float percentage;
    String grade;

    // Constructor
    Student(String name, int m1, int m2, int m3) throws ZeroMarksException{
        if (m1 < 0 || m2 < 0 || m3 < 0){
            throw new ZeroMarksException("Marks cannot be negative for " + name);
        }
        this.name = name;
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
    }

    // Implementing interface methods
    public void CalculateTotal(){
        total = marks[0] + marks[1] + marks[2];
    }

    public void CalculatePercentage(){
        percentage = total / 3.0f;
    }

    public void CalculateGrade(){
        if (percentage >= 75)
            grade = "Distinction";

        else if (percentage >= 60)
            grade = "First Class";

        else if (percentage >= 50)
            grade = "Second Class";
        
        else if (percentage >= 35)
            grade = "Pass";
        else
            grade = "Fail";
    }

    public void display(){
        System.out.println("\nName: " + name);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

// Main class
public class StudentResult{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student students[] = new Student[n];   

        for (int i = 0; i < n; i++){
            try {
                System.out.println("\nEnter details for Student " + (i + 1) + ":");

                System.out.print("Enter Name: ");
                String name = sc.next();

                System.out.print("Enter marks for 3 subjects: ");
                int m1 = sc.nextInt();
                int m2 = sc.nextInt();
                int m3 = sc.nextInt();

                students[i] = new Student(name, m1, m2, m3);

                students[i].CalculateTotal();
                students[i].CalculatePercentage();
                students[i].CalculateGrade();
            } 
            catch (ZeroMarksException e){
                System.out.println("Error: " + e.getMessage());
                i--; // repeat for same student
            }
        }

        System.out.println("\n----- STUDENT RESULTS -----");
        for (Student s : students){
            s.display();
        }

        sc.close();
    }
}
