class Student{
    int rollNo;
    String name;
    int marks;

    Student(int r, String n, int m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks of Maths: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Chaitanya", 78);
        Student s2 = new Student(2, "OM", 85);

        s1.display();
        s2.display();

        if (s1.marks > s2.marks)
            System.out.println("Topper in Maths: " + s1.name);
        else
            System.out.println("Topper in Maths: " + s2.name);
    }
}

