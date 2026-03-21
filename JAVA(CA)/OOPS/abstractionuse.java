    abstract class Car{
    void start(){
        System.out.println("Car is starting");
    }
    abstract void accelerate();
        // System.out.println("Car is accelerating");
    
     abstract void brake();
        // System.out.println("Car is stopping");
    
}
class fuelcar extends Car{
    void refuel(){
        System.out.println("Car is refueling");
    }
    @Override//good practice to use @Override annotation to indicate
    // that we are overriding a method from the parent class
    void accelerate(){
        System.out.println("Car is accelerating");
    }
    @Override
    void brake(){
        System.out.println("Car is stopping");
    }

}
class electriccar extends Car{
    void recharge(){
        System.out.println("Car is recharging");
    }
    @Override
    void accelerate(){
        System.out.println("Car is accelerating");
    }
    @Override
    void brake(){
        System.out.println("Car is stopping");
    }
}
public class abstractionuse {
    public static void main(String[] args) {
        Car fcar = new fuelcar();
        fcar.start();
        fcar.accelerate();
        fcar.brake();
        // fcar.refuel();

        Car ecar = new electriccar();
        ecar.start();
        ecar.accelerate();
        ecar.brake();
        // ecar.recharge();
    }
}
//abstraction is a fundamental concept in object-oriented programming that allows us to
// hide the implementation details of a class and only expose the necessary functionality to the user.
// In Java, we can achieve abstraction using abstract classes and interfaces.
