class student {
    String name;
    int age;
    int rollno;
    String college;
// constructor chaining is defined as the process of calling one constructor from another constructor with respect to current object. 
// It is used to reuse the constructor. 
// It can be done in two ways: within the same class using this() and from the parent class using super().
    student() {
        this("unknown");
    }

    student(String name) {
        this(name, 0);
    }

    student(String name, int age) {
        this(name, age, 0);
    }

    student(String name, int age, int rollno) {
        this(name, age, rollno, "unknown");
    }

    // Fixed constructor
    student(String name, int age, int rollno, String college) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.college = college;
    }
}

public class constructor {
    public static void main(String[] args) {
        student s1 = new student();

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Roll No: " + s1.rollno);
        System.out.println("College: " + s1.college);
    }
}