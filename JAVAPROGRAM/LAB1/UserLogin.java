import java.io.Console;

public class UserLogin {
    public static void main(String[] args) {
        Console console = System.console();

        // Check if console is available
        if (console == null) {
            System.out.println("Console not available. Please run from command prompt.");
            return;
        }

        // Read username
        String username = console.readLine("Enter username: ");

        // Read password (hidden input)
        char[] passwordArray = console.readPassword("Enter password: ");
        String password = new String(passwordArray);

        // Display entered details
        System.out.println("\nEntered Username: " + username);
        System.out.println("Entered Password: " + password);
    }
}