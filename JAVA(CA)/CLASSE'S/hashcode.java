//return an integer of an object
//compare two objects using equals method return true if both objects are same otherwise return false

import java.util.Objects;

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
       @Override
         public int hashCode(){
        //   int result=17;
        //     result=31*result+id;
        //     result=31*result+(name==null?0:name.hashCode());//handle null pointer exception
        //     return result;
        return Objects.hash(id,name);
         }
 
}
public class hashcode
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
        System.out.println(s1.hashCode()==s2.hashCode()); //hashcode of s1

        System.out.println(s1.getClass().getName()); //get the class name of s1
        System.out.println(s1 instanceof Student); //check if s1 is an instance of Student class
        System.out.println(s1 instanceof Object); //check if s1 is an instance of Object class
    }
}