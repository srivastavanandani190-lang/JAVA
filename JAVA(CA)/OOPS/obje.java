class Student{
    int age;//instance variable stored in heap memory
    String name;
    int rollno;
    String college;
    //default constructor is created by the compiler if we do not define any constructor in the class.
    // Student(){
    //     age=20;
    //     name="Rohit";
    //     rollno=101;
    //     college="ABC College";
    // }
    //parameterized constructor is created by the programmer to initialize the instance variables with different values.
    Student(int age,String name,int rollno,String college){
        this.age=age;
        this.name=name;
        this.rollno=rollno;
        this.college=college;
    }

}
public class obje {
    public static void main(String[] args) {
        // Student s1=new Student();
        // System.out.println("Name: "+s1.name);
        // System.out.println("Age: "+s1.age);
        // System.out.println("Roll No: "+s1.rollno);
        // System.out.println("College: "+s1.college);
        Student s2=new Student(22,"Rohit",101,"ABC College");
        System.out.println("Name: "+s2.name);
        System.out.println("Age: "+s2.age);
        System.out.println("Roll No: "+s2.rollno);
        System.out.println("College: "+s2.college);

    }
}
//loacal variable is a variable that is declared inside a method and can only be accessed within that method. 
// It is stored in the stack memory and is created when the method is called and destroyed when the method is exited.
//Local variables do not have default values and must be initialized before use because scope is limited and for java optimization.

