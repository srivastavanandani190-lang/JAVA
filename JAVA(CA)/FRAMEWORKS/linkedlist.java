import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("LinkedList");
        System.out.println(list);
    }
}
//less than 10% in production code, more than 90% in test code
//accessing elements in the middle of the list is slower than accessing elements at the beginning or end of the list
//LinkedList is not synchronized, so it is not thread-safe. If you need a thread-safe version of LinkedList, you can use Collections.
//it used doubly linked list data structure, which allows for efficient insertion and deletion of elements at both ends of the list.
 
