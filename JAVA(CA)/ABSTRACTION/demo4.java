interface A{
    default void fun(){
        System.out.println("Default implementation in A");
    }
}
class B{
    public void fun(){
        System.out.println("Hello");
    }
}
class D extends B implements A{
    // No need to override fun() since B's implementation takes precedence over A's default method
}
public class demo4 {
    public static void main(String[] args) {
        D d = new D();
        d.fun(); // This will call B's fun() method, not A's default method
    }
}
//java resolution order: class > interface > default method