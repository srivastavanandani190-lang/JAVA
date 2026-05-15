import java.util.*;
public class demo6 {
    public static void main(String[] args) {
         Stack<Integer> stack = new Stack<>();
         stack.push(10);
         stack.push(20);
         stack.push(30);
         System.out.println("Stack: " + stack);
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);
        int removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Stack after pop: " + stack);

    }
}