interface Mathconstant{
    double PI = 3.14;
    double E = 2.71;
    void fun();
}
class Circle implements Mathconstant{
    public void fun(){
        System.out.println("The value of PI is: " + PI);
    }
}
class Exponential implements Mathconstant{
    public void fun(){
        System.out.println("The value of E is: " + E);
    }
}
public class demo1 {
    public static void main(String[] args) {
        Mathconstant m = new Circle();
        m.fun();
        m = new Exponential();
        m.fun();
        System.out.println("The value of PI is: " + Mathconstant.PI);
        System.out.println("The value of E is: " + Mathconstant.E);
        //very important point: we can access the constants defined in the interface using the interface name, without creating an object of the interface.
    }
}
// In this example, we have an interface Mathconstant that defines two constants PI and E, and a method fun().
// We have two classes Circle and Exponential that implement the Mathconstant interface and provide their own
