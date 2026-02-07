class student{
    private int age;
    private String name;
    public student(){
        System.out.println("Constructor called");
    }//default constructor
     public student(int age, String name){
        this.age = age;
        this.name = name;
    }//parameterized constructor
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
public class useconstructor {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student(20, "Alice");
        System.out.println("Student 1: Age = " + s1.getAge() + ", Name = " + s1.getName());
        System.out.println("Student 2: Age = " + s2.getAge() + ", Name = " + s2.getName());
    }
}
