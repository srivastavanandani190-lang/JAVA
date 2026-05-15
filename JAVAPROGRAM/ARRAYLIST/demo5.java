import java.util.*;
public class demo5{
    public static void main(String[] args) {
       LinkedList<String> list = new LinkedList<>();
         list.add("Hello");
         list.add("World");
            list.add("Java");
            System.out.println("LinkedList: " + list);
                list.remove("World");
                System.out.println("After removing 'World': " + list);
               list.addFirst("Welcome");
               System.out.println("After adding 'Welcome' at the beginning: " + list);  
                list.addLast("Programming");
                System.out.println("After adding 'Programming' at the end: " + list);
                 String firstElement = list.getFirst();
                 System.out.println("First element: " + firstElement);
                  String lastElement = list.getLast();
                  System.out.println("Last element: " + lastElement);
                     list.clear();
                     System.out.println("After clearing the LinkedList: " + list);
                        
    }
}