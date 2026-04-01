interface Payment{
    void pay();
}
class CreditCard implements Payment{
    public void pay(){
        System.out.println("Payment done using credit card");
    }
}
class DebitCard implements Payment{
    public void pay(){
        System.out.println("Payment done using debit card");
    }
}
public class demo {
    public static void main(String[] args) {
        Payment p = new CreditCard();
        p.pay();
        p = new DebitCard();
        p.pay();
    }
}
//polymorphism is the ability of an object to take on many forms.
//  In this example, we have an interface Payment and two classes CreditCard and DebitCard that implement the Payment interface. 
// We can create a reference of type Payment and assign it to an object of either CreditCard or DebitCard, allowing us to call the pay() method without knowing the specific type of payment being used.
//  This demonstrates polymorphism in Java.