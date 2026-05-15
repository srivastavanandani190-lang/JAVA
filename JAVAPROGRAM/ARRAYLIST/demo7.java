import java.util.*;
public class demo7 {
    public static void main(String[] args) {
         Vector<Double> vector = new Vector<>();
         vector.add(3.14);
         vector.add(2.718);
         System.out.println("Vector: " + vector);
            double firstElement = vector.firstElement();
            System.out.println("First element: " + firstElement);
                double lastElement = vector.lastElement();
                System.out.println("Last element: " + lastElement);
                    vector.remove(0);
                    System.out.println("After removing the first element: " + vector);
                    
    }
}