class Student{
    String name;
    int age;
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
public class objectclass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;

        Student s2 = new Student();
        s2.name = "Bob";
        s2.age = 22;

        System.out.println("Student 1: " + s1.name + ", Age: " + s1.age);
        System.out.println("Student 2: " + s2.name + ", Age: " + s2.age);
        System.out.println(s1.toString());// This will print the default toString() output, which includes the class name and hash code.
        System.out.println(s2);// This will print the default toString() output, which includes the class name and hash code.

    }
}
//tostring() method is used to return a string representation of the object. By default, it returns the class name followed by the "@" symbol and the object's hash code in hexadecimal. 
// However, you can override this method in your class to provide a more meaningful string representation of your objects, as shown in the Student class above.