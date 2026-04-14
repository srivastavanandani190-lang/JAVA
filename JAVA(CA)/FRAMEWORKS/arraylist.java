import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
         List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        System.out.println(list1);
        Iterator<Integer>iterator1 = list1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
       Collection<Integer> collection = new TreeSet<>();//hashset,linkedhashset,treeset
        collection.add(100);
        collection.add(200);
        collection.add(300);
        collection.add(400);
        collection.add(500);
        System.out.println(collection);
         Iterator<Integer> iterator2 = collection.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

    }
}
//set store unique values and does not maintain the order of insertion(hashvalue)
//list store duplicate values and maintain the order of insertion
