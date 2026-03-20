class Bankaccount{
    private double balance;
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    // Getter method to access the private balance variable
    public double getBalance(){
        return balance;
    }

}
public class encapsulation {
    public static void main(String[] args) {
        Bankaccount account = new Bankaccount();
        account.deposit(1000);
        account.withdraw(500);
        // account.balance = 10000; // This will cause an error because balance is private
        System.out.println("Current balance: " + account.getBalance());
    }
}
//getter is used to access the private variables and setter is used to modify the private variables.
//it is used for validation and to control the access to the private variables.


// class student{
//     private String name;
//     private int age;
//     //getter and setter methods for name and age
//     public void setName(String name){
//         this.name = name;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setAge(int age){
//         if(age > 0){
//             this.age = age;
//         } else {
//             System.out.println("Age must be positive");
//         }
//     }
//     public int getAge(){
//         return age;
//     }
// }