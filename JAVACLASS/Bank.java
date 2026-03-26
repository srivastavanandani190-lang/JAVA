import java.util.Scanner;

class BankAccountTest {
    private double balance;

    public BankAccountTest(double initialBalance) {
        if (initialBalance >= 0)
            balance = initialBalance;
        else {
            balance = 0;
            System.out.println("Initial balance cannot be negative. Set to 0.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
                    }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Bank{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccountTest account = new BankAccountTest(initialBalance);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    account.deposit(scanner.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    account.withdraw(scanner.nextDouble());
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the bank system.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
// Write a Java program to demonstrate Compile-time Polymorphism (Method Overloading) by creating a class Calculator that performs addition of integers, floating values, and three numbers using overloaded methods.
//Write a Java program to demonstrate Single Inheritance by creating a Person class and deriving a Student class from it, and display the details of the student using inherited properties and methods.
//Write a Java program to demonstrate Runtime Polymorphism (Method Overriding) by creating a base class Shape and derived classes Circle and Rectangle to override the area() method and display the area of each shape.
//Write a Java program to justify that Java does not support multiple inheritance using classes, but multiple inheritance can be achieved using interfaces by implementing more than one interface in a single class.
