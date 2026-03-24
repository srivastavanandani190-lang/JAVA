class Person{
    void introduce(){
        System.out.println("I am a person");
    }
    //no greet 

}
class Guest extends Person{
    @Override
    void introduce(){
        System.out.println("I am a guest");
    }
}
public class anonymousclass {
    public static void main(String[] args) {
        Person obj=new Person(){
            //can't have constructor in anonymous class because it doesn't have a name, so we can't create an instance of it using the new keyword.
            String name="honey";
            @Override
            void introduce() {
                System.out.println("I am an anonymous class");
                System.out.println("My name is " + name);
            }
            // void greet(){
            //     System.out.println("Hello, welcome to the anonymous class!");
            // }
        };
        obj.introduce();
       
    }
}
//anonymous class is a class that is defined without a name and is instantiated in a single expression. 
//It is often used to create an instance of a class that implements an interface or extends a class without having to create a separate named class. 
//In the above code, we have created an anonymous class that extends the Person class and overrides the introduce method to provide a different implementation.
// When we call the introduce method on the obj instance, it will execute the overridden method in the anonymous class, printing "I am an anonymous class".
//anonymous-->lambda 
