import java.util.*;
public class iterator1 {
    public static void main(String[] args) {
      Collection<Integer> collection = new TreeSet<>();//hashset,linkedhashset,treeset
        collection.add(100);
        collection.add(200);
        collection.add(300);
        collection.add(400);
        collection.add(500);
         
         Iterator<Integer> iterator2 = collection.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}   
//iterable interface is implemented by collection interface and collection interface is implemented by all collection classes like list, set, queue, deque. 
//so we can use iterator to traverse the elements of any collection class.