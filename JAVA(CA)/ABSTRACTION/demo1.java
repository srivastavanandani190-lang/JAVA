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
    }
}
// In this example, we have an interface Mathconstant that defines two constants PI and E, and a method fun().
// We have two classes Circle and Exponential that implement the Mathconstant interface and provide their own
