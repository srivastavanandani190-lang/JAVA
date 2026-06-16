//comaprator interf ace
import java.util.*;
class Student {
    String name;
    int rollno;
    int marks;
    Student(String name,int rollno,int marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
}
class SortByName implements Comparator<Student>{
    @Override
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}
class SortByRollNo implements Comparator<Student>{
    @Override
    public int compare(Student s1,Student s2){
        return s1.rollno-s2.rollno;
    }
}
class SortByMarks implements Comparator<Student>{
    @Override
    public int compare(Student s1,Student s2){
        return s1.marks-s2.marks;
    }
}


public class demo {
    public static void main(String[] args) {
        List<Student> al=new ArrayList<>();
        al.add(new Student("sumi",1,90));
        al.add(new Student("anji",2,80));
        al.add(new Student("nilli",3,70));
        al.add(new Student("honey",4,60));
        Comparator<Student> c1=new SortByName();
        Comparator<Student> c2=new SortByRollNo();//object of sortbyrollno class
        Comparator<Student> c3=new SortByMarks();

        Collections.sort(al,c1);
         System.out.println("Sorting by name:");
            for(Student s:al){
                System.out.println(s.name+" "+s.rollno+" "+s.marks);
            }
            Collections.sort(al,c2);
                System.out.println("Sorting by rollno:");
                for(Student s:al){
                    System.out.println(s.name+" "+s.rollno+" "+s.marks);
                }
                Collections.sort(al,c3);
                    System.out.println("Sorting by marks:");
        for(Student s:al){
            System.out.println(s.name+" "+s.rollno+" "+s.marks);
        }

            //anonymous class
            Comparator<Student> c4=new Comparator<Student>(){
                @Override
                public int compare(Student s1,Student s2){
                    return s1.name.compareTo(s2.name);
                }
            };
             Collections.sort(al,c4);
             System.out.println("Sorting by name using anonymous class:");
            for(Student s:al){
                System.out.println(s.name+" "+s.rollno+" "+s.marks);
        }
        
    }
}