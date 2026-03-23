//nested class is define as class inside another class
//types of nested class
//1. static nested class
//2. non static nested class or inner class
//3. local inner class
//4. anonymous inner class
//uses-->1.logical grouping of classes that are only used in one place
//2.increasing encapsulation
//3.more readable and maintainable code
//4.better access to outer class members
//static nested class

class Outer{
    static int data=30;
    static class Inner{
        void msg(){
            System.out.println("data is "+data);
            System.out.println("this is static nested class");
        }
    }
}
public class basic {
    public static void main(String[] args) {
        Outer.Inner obj=new Outer.Inner();
        obj.msg();
    }
}
