import java.io.IOException;
public class demo {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a character:");
        char ch = (char) System.in.read();
        System.out.println("You entered: " + ch);
    }
}
//read() -->only reads one character at a time and returns the ASCII value of the character. 
// We need to cast it to char to get the actual character.