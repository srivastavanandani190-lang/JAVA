class student{
    int rollno;
    String name;
    int marks;
}
public class classarray {
    public static void main(String[] args) {
     student s1=new student();
     s1.rollno=101;
    s1.name="Alice";
    s1.marks=85;

    student s2=new student();
    s2.rollno=102;
    s2.name="Bob";
    s2.marks=90;

student s3=new student();
s3.rollno=103;
s3.name="Charlie";
s3.marks=78;
student[] students = new student[3];
students[0] = s1;
students[1] = s2;
students[2] = s3;
for(int i=0;i<students.length;i++){
    System.out.println("Student Roll No: " + students[i].rollno);
    System.out.println("Student Name: " + students[i].name);
    System.out.println("Student Marks: " + students[i].marks);
    System.out.println("--------------");


        }
    }
}