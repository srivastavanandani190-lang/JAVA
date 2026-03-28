final class Student {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class immutable {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}