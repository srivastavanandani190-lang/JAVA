interface A{
    void fun();
}
interface B extends A{
    default void fun(){
        System.out.println("Default implementation in B");
    }
}
interface C extends A{
    default void fun(){
        System.out.println("Default implementation in C");//D must override fun() to resolve the conflict between B and C
    }
}
class D implements B,C{
    public void fun(){
        // System.out.println("Hello");
        B.super.fun(); // Call B's default implementation
    }
}
public class demo3 {
    public static void main(String[] args) {
        D d = new D();
        d.fun();
    }
}
