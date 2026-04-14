import java.io.*;
import java.util.*;

public class MultiInputHoney
{
    public static void main(String[] args) throws IOException {
        
        // 1. Command Line Arguments
        System.out.println("=== Command Line Arguments ===");
        if (args.length > 0) {
            System.out.println("You entered via command line: " + Arrays.toString(args));
        } else {
            System.out.println("No command line arguments provided.");
        }

        // 2. DataInputStream
        System.out.println("\n=== DataInputStream ===");
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter a string using DataInputStream: ");
        String disInput = dis.readLine();   // readLine() is deprecated but works for demo
        System.out.println("You entered: " + disInput);

        // 3. BufferedReader
        System.out.println("\n=== BufferedReader ===");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string using BufferedReader: ");
        String brInput = br.readLine();
        System.out.println("You entered: " + brInput);

        // 4. Scanner
        System.out.println("\n=== Scanner ===");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string using Scanner: ");
        String scInput = sc.nextLine();
        System.out.println("You entered: " + scInput);

        // 5. Console Class
        System.out.println("\n=== Console Class ===");
        Console console = System.console();
        if (console != null) {
            String consInput = console.readLine("Enter a string using Console: ");
            System.out.println("You entered: " + consInput);
        } else {
            System.out.println("Console is not available in this environment (e.g., IDEs). Try running in terminal.");
        }

        sc.close();
    }
}
