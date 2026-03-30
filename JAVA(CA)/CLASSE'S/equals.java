//compare two objects using equals method return true if both objects are same otherwise return false
class Student
{
    int id;
    String name;
       public boolean equals(Object obj){
        if(obj == null)//nullpointer exception
        return false;


//check if both class are of type student or not
//if we are trying to compare student object with any other object then it will return false
        if(obj.getClass() != this.getClass())//class cast exception
        return false;
      Student s=(Student)obj;
      return this.id==s.id && this.name.equals(s.name);
       }
 
}
public class equals
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.id=101;
        s1.name="John";
        
        Student s2=new Student();
        s2.id=101;
        s2.name="John";
        
        Student s3=new Student();
        s3=null;

        
        System.out.println(s1.equals(s2)); //true because both objects have the same id and name
        System.out.println(s1.equals(s3)); //false because s3 is null
    }
}