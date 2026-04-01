interface Car{
    void drive();
}
class Thar implements Car{
    public void drive(){
        System.out.println("Thar is driving");
    }
}
public class basic {
    public static void main(String[] args) {
        Car c = new Thar();
        c.drive();
    }
}
//interface--->it is a blueprint of class which contains only abstract methods and final variables. It is used to achieve abstraction and multiple inheritance in java.
//  It is also used to achieve loose coupling between classes. It is also used to achieve polymorphism in java. It is also used to achieve dynamic method dispatch in java.