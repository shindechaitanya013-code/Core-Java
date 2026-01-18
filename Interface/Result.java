// Write an application to define an interface ‘CalculateResult’ with methods
// CalculateTotal(), CalculatePercentage() and CalculateGrade(). Write student class with
// implementation of ‘CalculateResult’. Create student object and display total marks,
// percentage and grade of student.

import java.util.*;

interface CalculateResult {
    void CalculateTotal();
    void CalculatePercentage();
    void CalculateGrade();
}

class Student implements CalculateResult {
    int m1, m2, m3;
    int total;
    float percentage;
    String grade;

    Scanner sc = new Scanner(System.in);

    Student() {
        System.out.print("Enter Marks of Subject 1: ");
        m1 = sc.nextInt();
        System.out.print("Enter Marks of Subject 2: ");
        m2 = sc.nextInt();
        System.out.print("Enter Marks of Subject 3: ");
        m3 = sc.nextInt();
    }

    public void CalculateTotal() {
        total = m1 + m2 + m3;
    }

    public void CalculatePercentage() {
        percentage = (total / 3.0f);
    }

    public void CalculateGrade() {
        if (percentage >= 75)
            grade = "A";
        else if (percentage >= 60)
            grade = "B";
        else if (percentage >= 50)
            grade = "C";
        else
            grade = "Fail";
    }

    void display() {
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}

public class Result{
    public static void main(String[] args) {

        Student s = new Student();
        s.CalculateTotal();
        s.CalculatePercentage();
        s.CalculateGrade();
        s.display();
    }
}
