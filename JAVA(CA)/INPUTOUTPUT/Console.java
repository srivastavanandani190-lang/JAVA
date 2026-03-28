public class Console {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
       int age=-2;
       if(age < 0){
           System.err.println("Age cannot be negative.");
       }
        System.err.println("This is an error message.");
    }
}   

//system class -->Printstream class --> println() method


//console ip/op is used to print the output on the console and also to take input from the user.
//System.out.println() is used to print the output on the console.
//System.in is used to take input from the user. It is a standard input stream. We can use Scanner class to take input from the user.
//class System is a final class in java.lang package. It contains several useful class fields and methods. 
// It cannot be instantiated. The System class provides a standard input stream