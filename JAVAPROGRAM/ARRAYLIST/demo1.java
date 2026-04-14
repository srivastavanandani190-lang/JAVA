import java.util.LinkedList;
import java.util.Queue;
public class demo1{
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // Adding elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
// Removing and returning the head of the queue
         System.out.println("Removed element: " + queue.remove()); // Output: Alice
         // Returning the head of the queue without removing it
         System.out.println("Peeked element: " + queue.peek()); // Output: Bob
// Checking if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: false
}
}
