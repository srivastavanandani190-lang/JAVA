class student{
    int rollno;
    String name;
    float fee;
    // instance variable is defined as variable which is declared in a class but outside the method, 
    // constructor or block. It is also called as non-static variable because it is not declared as static. 
    // It is created when an object of the class is created and destroyed when the object is destroyed.
    // It can be accessed by all the methods of the class.


    // local variable is defined as variable which is declared inside the method,
    // constructor or block. It is also called as non-static variable because 
    // it is not declared as static. It is created when the method, constructor or block is called 
    // and destroyed when the method, constructor or block is exited. It can be accessed only within the method, 
    // constructor or block in which it is declared.


    student(int rollno, String name, float fee){
    //    rollno=rollno;
    //    name=name;   
    //    fee=fee;
    // without this keyword it will not assign the value to the instance variable because local variable and 
    // instance variable have same name so it will take local variable and assign it to itself but with this
    // keyword it will assign the value to the instance variable.

    this.rollno=rollno;
    this.name=name;
    this.fee=fee;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }
}


public class thisuse {
    public static void main(String[] args) {
        student s1=new student(111,"ankit",5000f);
        student s2=new student(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}
