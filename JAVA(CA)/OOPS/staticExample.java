class Student{
    int rollno;
    String name;
    static String college;
    
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    static {
        college = "ABC College";
    }
    
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
public class staticExample {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");
        
        s1.display();
        s2.display();
        
        // Changing the college name for all students
        // Student.college = "XYZ University";
        
        s1.display();
        s2.display();
    }
}
//static block is used to initialize static variables.
//  It is executed when the class is loaded into memory, before any objects are created. 
// In this example, the static block initializes the static variable 'college' with the value "ABC College".
//  All instances of the Student class will share this same college name.