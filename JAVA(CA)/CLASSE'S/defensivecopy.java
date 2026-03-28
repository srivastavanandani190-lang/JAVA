final class Student {
    private final String name;
    private final int age;
    private final college college;

    public Student(String name, int age, college college) {
        this.name = name;
        this.age = age;
        this.college = new college(college.name, college.location);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public college getCollege() {
        return new college(college.name, college.location);
        //defensive copy to prevent external modification of the college object
    }
     
}
//not completely immutable because college is mutable and can be changed after the student object is created.

class college{
    String name;
    String location;
    college(String name, String location){
        this.name = name;
        this.location = location;
    }
}

public class defensivecopy {
    public static void main(String[] args) {
       college college = new college("ABC College", "New York");
         Student student = new Student("Alice", 20, college);
          System.out.println("Name: " + student.getName());
          System.out.println("Age: " + student.getAge());
          System.out.println("College Name: " + student.getCollege().name);
          System.out.println("College Location: " + student.getCollege().location);
          student.getCollege().name = "XYZ College";
          System.out.println("Updated College Name: " + student.getCollege().name);

        

    }
}