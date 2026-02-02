public class operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));          // 15
        System.out.println("Subtraction: " + (a - b));       // 5
        System.out.println("Multiplication: " + (a * b));    // 50
        System.out.println("Division: " + (a / b));          // 2
        System.out.println("Modulus: " + (a % b));           // 0

        // Assignment Operators
        int c = a; // c = 10
        c += b;    // c = c + b -> c = 15
        System.out.println("c after += : " + c);
        c -= b;    // c = c - b -> c = 10
        System.out.println("c after -= : " + c);

        // Comparison Operators
        System.out.println("a == b: " + (a == b));          // false
        System.out.println("a != b: " + (a != b));          // true
        System.out.println("a > b: " + (a > b));            // true
        System.out.println("a < b: " + (a < b));            // false

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));          // false
        System.out.println("x || y: " + (x || y));          // true
        System.out.println("!x: " + (!x));                    // false
    }
}