class Student{
    public String name;
    public int rollno;
    Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
}
public class array {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Alice", 1);
        students[1] = new Student("Bob", 2);
        students[2] = new Student("Charlie", 3);

        for(Student student : students){
            System.out.println("Name: " + student.name + ", Roll No: " + student.rollno);
        }
    }
}