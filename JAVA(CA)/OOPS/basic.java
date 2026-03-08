class Student{
    int id;
    String name;
    int age;

    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class basic{
    public static void main(String[] args) {
        Student s1 = new Student();
        //s1 is a reference variable that holds the reference to the object created using the new keyword and stored in the heap memory.
        s1.id = 101;
        s1.name = "John";
        s1.age = 20;

        s1.display();
    }
}
//class is a blueprint for creating objects.
//It defines the properties and behaviors of the objects.  
//object is an instance of a class. 
//It is created using the new keyword and can access the properties and behaviors defined in the class.