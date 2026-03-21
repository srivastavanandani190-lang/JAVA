interface Carable
{
    void start();
    void stop();
}
//mainly interface name should be adjective and should end with able,ible,ive etc
//because it defines the capabilities of a class.
class Maruti implements Carable
{
    //why public because interface methods are public by default and we cannot reduce the visibility of the method while implementing it.
    public void start()
    {
        System.out.println("Maruti is starting");
    }
    public void stop()
    {
        System.out.println("Maruti is stopping");
    }
}
class Honda implements Carable
{

    public void start()
    {
        System.out.println("Honda is starting");
    }
    public void stop()
    {
        System.out.println("Honda is stopping");
    }
}
public class interfaceuse
{
    public static void main(String[] args)
    {
        Carable c1 = new Maruti();
        Carable c2 = new Honda();
        c1.start();
        c1.stop();
        c2.start();
        c2.stop();
    }
}
//interface is a blueprint of a class.
//it is like a contract that defines what a class can do, but not how it does it.
//responsiblities, capabilities and role of a class are defined by an interface.
// It has static constants and abstract methods. 
// It is used to achieve abstraction and multiple inheritance in java.
//  It is also used to provide a contract for the classes that implement it.
//defines pure what a class can do, but not how it does it.
//pure abstraction is achieved by using interfaces in java.

//abstract class partial what and how a class can do. It can have abstract and non-abstract methods.
//families of similar objects.