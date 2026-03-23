//local class -->within any block of code
class Outer{
    void greet(){
        final int x=10;//local variable
        //x++;//-->compiler error because local class can access only final variable of method
        //to avoid ambiguity we can declare local variable as final
        class Local{
            void msg(){
                System.out.println("x = " + x);
                System.out.println("this is local class");
            }
        }
        Local obj=new Local();//heap memory
        obj.msg();
    }
}
public class local {
    public static void main(String[] args) {
        Outer obj1=new Outer();
        obj1.greet();//can be same as local object name but it is not local class object
    }
}
//effectively final variable-->local class can access only final variable of method

 