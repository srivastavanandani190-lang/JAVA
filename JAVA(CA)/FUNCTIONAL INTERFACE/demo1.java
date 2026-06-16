import java.util.function.*;
import java.util.*;

public class demo1 {
    public static void main(String[] args) {

       // Using a lambda expression to implement the Function interface
       Function<Integer, String> square= (Integer x) -> "Square: " + (x * x);
       // Using the apply method to get the result
       String result = square.apply(5);
       System.out.println(result); // Output: Square: 25

       //consumer interface
       Consumer<String> print = (String s) -> System.out.println("Hello, " + s);
       print.accept("World"); // Output: Hello, World   

       //Supplier interface
       Supplier<Double> randomValue = () -> Math.random();
       System.out.println("Random Value: " + randomValue.get()); // Output: Random Value: <some random number>

       //Predicate interface
       Predicate<Integer> isEven = (Integer n) -> n % 2 == 0;
       System.out.println("Is 4 even? " + isEven.test(4)); // Output: Is 4 even? true

       //iterator interface
         List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        //  for (String name : names) {
        //      System.out.println(name);
        //  }
         names.forEach((name) -> System.out.println(name));  

    }
}