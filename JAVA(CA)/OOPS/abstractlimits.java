class abstractlimits {
    public static void main(String[] args) {
        // Abstract class cannot be instantiated
        // abstract limits obj = new limits(); // This will cause a compilation error

        // We can create an instance of the subclass
       Animal myDog = new Dog("Buddy");
        myDog.sound(); // Output: The dog barks.
        myDog.eat();   // Output: This animal eats food.
    }
}
//abstract classes
//1.cannot be instantiated directly Animal obj = new Animal(); // This will cause a compilation error
//2.can have abstract and non-abstract methods
//3.can also contain normal methods with implementation
//4.is meant to be extended by other classes
abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }

    abstract void sound(); // abstract method
    void eat() { // non-abstract method
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    Dog(String name){
        super(name);
    }
    @Override
    void sound() { // providing implementation for the abstract method
        System.out.println("The dog barks.");
    }
}
//1.can abstract class have a constructor?
//Yes, abstract classes can have constructors, but they cannot be instantiated directly. 
//The constructor of an abstract class is called when an instance of a subclass is created.
//2.can abstract class have final keyword?
//no, abstract classes cannot be declared as final because they are meant to be extended by other classes.
//3.can abstract class have static method?
//Yes, abstract classes can have static methods.
//Static methods belong to the class rather than any instance of the class, and they can be called without creating an instance of the abstract class.
//However, static methods cannot be abstract, as they cannot be overridden by subclasses.
//4.can abstarct have private method?
//no if yes then non abstract.
//final means can't be overrridden but abstract means must be overridden. so they are opposite to each other.
//5.can abstract class have no Abstract method?
//Yes, an abstract class can have no abstract methods.

//pojo-->Plain Old Java Object
//A POJO is a simple Java object that does not have any special restrictions and does not require any classpath. 
//It is a term used to describe a Java object that is not bound by any special framework or convention.
//POJOs are often used to represent data and can be easily serialized and deserialized. 
//They typically have private fields, public getters and setters, and may override methods like toString(), equals(), and hashCode().
//just model class no framework or special restriction.
//builder or business logic
//anemic model-->only data no business logic
//rich domain model-->data and business logic
