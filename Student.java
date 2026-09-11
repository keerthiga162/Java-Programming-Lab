import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println();
    }

    String calculateGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 50)
            return "D";
        else
            return "F";
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Rahul";
        s1.rollNumber = 101;
        s1.marks = 85;

        s2.name = "Priya";
        s2.rollNumber = 102;
        s2.marks = 92;

        System.out.println("Student 1:");
        s1.display();

        System.out.println("Student 2:");
        s2.display();
    }
}
