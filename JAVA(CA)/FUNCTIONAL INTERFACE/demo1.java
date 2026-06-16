import java.util.function.*;

public class demo1 {
    public static void main(String[] args) {
        // Using a lambda expression to implement the Function interface
        Function<Integer, String> square= (Integer x) -> "Square: " + (x * x);

        // Using the apply method to get the result
        String result = square.apply(5);
        System.out.println(result); // Output: Square: 25
    }
}