class student{
    private String name;
    private int age;
    private String grade;

// Write a Java program to create a Student class, initialize student details using a parameterized constructor, 
// and display the student information using class objects and member functions.
    student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
class studentm {
    public static void main(String[] args) {
        student student1 = new student("Alice", 20, "A");
        student student2 = new student("Bob", 22, "B");
        System.out.println("Student 1 Information:");
        student1.displayInfo();
        System.out.println("\nStudent 2 Information:");
        student2.displayInfo();
    }
}