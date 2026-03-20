//inheritance is a fundamental OOP concept that allows a new class (child) to inherit properties and behaviors from an existing class (parent).
//This promotes code reusability and establishes a natural hierarchical relationship between classes.

//types-->1. Single Inheritance: A child class inherits from one parent class.

//2. Multilevel Inheritance: parent-->child-->grandchild, where a child class inherits from a parent class, and another class inherits from that child class.

//3. Hierarchical Inheritance: Multiple child classes inherit from a single parent class.

//4.multiple Inheritance: A child class inherits from multiple parent classes (not supported in Java, but can be achieved using interfaces). 

class Student{
    String name;
    int age;
    String course;

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Course: "+course);
    }
    void attendance(){
        System.out.println(name+" is attending the class.");
    }
}
class Engineer extends Student{
    String specialization;

    void displaySpecialization(){
        System.out.println("Specialization: "+specialization);
    }
}
//parent-->superclass-->base class
//child-->subclass-->derived class
public class inheritance {
    public static void main(String[] args) {
        Engineer eng = new Engineer();
        eng.name = "Alice";
        eng.age = 25;
        eng.course = "Computer Science";
        eng.specialization = "Software Engineering";

        eng.display();
        eng.attendance();
        eng.displaySpecialization();
    }
}