class calc{
    int a,b;
    public int add(int x, int y){
        return x + y;
    }
    public int sub(int x, int y){
        return x - y;
    }
}
class calc2 extends calc{
    public int mul(int x, int y){
        return x * y;
    }
    public int div(int x, int y){
        return x / y;
    }
}
//inheritance is the process by which one class acquires the properties (fields) and behaviors (methods) of another class.
//  The class that inherits the properties and behaviors is called the subclass (or child class), and the class from which it 
// inherits is called the superclass (or parent class). In this example, calc2 is the subclass that inherits from the superclass calc.
//  This allows calc2 to use the add and sub methods defined in calc, as well as its own mul and div methods.

//in java multiple inheritance is not supported, which means that a class cannot inherit from more than one class.
//  However, a class can implement multiple interfaces to achieve similar functionality.
public class calculator {
    public static void main(String[] args) {
        calc2 c = new calc2();
        System.out.println(c.add(10, 5));
        System.out.println(c.sub(10, 5));
        System.out.println(c.mul(10, 5));
        System.out.println(c.div(10, 5));
    }
}
