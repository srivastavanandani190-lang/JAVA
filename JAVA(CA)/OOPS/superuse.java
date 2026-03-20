//super keyword is used to refer to the immediate parent class object. 
// It can be used to access parent class methods and variables. 
//  By using super.print(), we can call the print method of the Student class to display the common attributes before displaying the college name specific to CollegeStudent.
class Student{
    String name;
    int age;
    int rollno;
    Student(){
        System.out.println("Student class constructor called");
    }
    void print(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll No: "+rollno);
    }
}
class CollegeStudent extends Student{
    String collegeName;
        CollegeStudent(){
            super(); // Calls the constructor of the parent class (Student)
            System.out.println("CollegeStudent class constructor called");
        }
    void print(){
        super.print();
        System.out.println("College Name: "+collegeName);
    }
}
public class superuse {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();
        cs.name = "John";
        cs.age = 20;
        cs.rollno = 101;
        cs.collegeName = "ABC College";
        cs.print();
    }
}