public class stringbasic {
    public static void main(String[] args) {
        // Creating a string using string literal
        String str1 = "Hello, World!";
        System.out.println("String 1: " + str1);
        System.out.println(str1.hashCode());//hashcode is refered to memory location in hexadecimal form.

        // Creating a string using the new keyword
        String str2 = new String("Java Programming");
        System.out.println("String 2: " + str2);

        // Concatenating two strings
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated String: " + str3);

        // Finding the length of a string
        int length = str1.length();
        System.out.println("Length of String 1: " + length);

        // Accessing a character at a specific index
        char ch = str2.charAt(5);
        System.out.println("Character at index 5 of String 2: " + ch);

        // Converting string to uppercase
        String upperStr = str1.toUpperCase();
        System.out.println("Uppercase String 1: " + upperStr);

        // Converting string to lowercase
        String lowerStr = str2.toLowerCase();
        System.out.println("Lowercase String 2: " + lowerStr);
    }
}