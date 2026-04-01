interface Vehicles{
    default void drive(){
        System.out.println("This is a default method in the interface.vehicle is driving");
        privateMethod(); // Calling private method from default method
    }
    static void stop(){
        System.out.println("This is a static method in the interface.vehicle is stopping");
    }
    private void privateMethod(){
        System.out.println("This is a private method in the interface");
    }
}
class Car implements Vehicles{
    public void drive(){
        System.out.println("Car is driving");
    }
}
class Bike implements Vehicles{
    // public void drive(){
    //     System.out.println("Bike is driving");
    // }
}
public class demo2 {
    public static void main(String[] args) {
        Vehicles v = new Car();
        v.drive();
        v = new Bike();
        v.drive();
        Vehicles.stop(); // Calling static method directly using the interface name
    }
}
//after java 8-->default methods
//private
//static 
//list interfaces -->methods 
