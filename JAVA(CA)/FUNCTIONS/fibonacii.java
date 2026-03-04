public class fibonacii{
    public static void main(String[] args) {
        int n = 10; // Change this value to compute Fibonacci for different n
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: Fibonacci of 0 is 0
        } else if (n == 1) {
            return 1; // Base case: Fibonacci of 1 is 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }
}