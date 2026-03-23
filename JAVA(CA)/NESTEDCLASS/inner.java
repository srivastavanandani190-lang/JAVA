//inner class
class Outer{
    int data=30;
    class Inner{
        //Outer outer already 
        int data=45;
        void msg(){
            System.out.println("data is "+data*45);
            System.out.println("this is inner class");
            System.out.println("data is "+Outer.this.data);
        }
        static void msg1(){
            System.out.println("this is static method in inner class");
        }
        //before java 16 we cannot declare static method in inner class but from java 16 we can declare static method in inner class but it should be a compile time constant
        //because sattic method in inner class helps to access the static members of outer class without creating the object of inner class
    }
}
public class inner {
    public static void main(String[] args) {
       Outer.Inner in=new Outer().new Inner();
        in.msg();
        Outer.Inner.msg1();
    }
}
 