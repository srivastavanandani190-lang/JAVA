//buffered reader-->stream of characters-->used to read text from a character-input stream, buffering characters for efficient reading of characters, arrays, and lines.
import java.io.*;
public class demo1 {
    public static void main(String[] args) throws IOException {
        //InputStreamReader is a bridge from byte streams to character streams. It reads bytes and decodes them into characters using a specified charset.
        //InputStreamReader reader = new InputStreamReader(System.in);

        //BufferedReader is used to read the text from a character-input stream, buffering characters for efficient reading of characters, arrays, and lines.
        //BufferedReader breader = new BufferedReader(reader);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        String name = reader.readLine();
        System.out.println("Hello, " + name + "!");

        //interger input
        System.out.println("Enter your age:");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("You are " + age + " years old.");
        
    }
}

