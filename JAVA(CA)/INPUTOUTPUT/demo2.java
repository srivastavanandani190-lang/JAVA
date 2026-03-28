//scanner class-->simplicity and versatility for reading various types of input from the user.
//It provides methods to read different data types, making it easier to handle user input in Java applications.

import java.util.Scanner;
public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //creating an object of the Scanner class to read input from the user. 
        //We pass System.in as an argument to the Scanner constructor, which tells the Scanner to read from the standard input stream (the console).
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        //integer input
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        //double input
        System.out.println("Enter your height in meters:");
        double height = scanner.nextDouble();
        System.out.println("Your height is " + height + " meters.");

        //boolean input
        System.out.println("Do you like Java? (true/false):");
        boolean likesJava = scanner.nextBoolean();
        System.out.println("You like Java: " + likesJava);

        scanner.close();
    }
}
