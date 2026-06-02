
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
   
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Java");
        arrayList.add("ArrayList");
        System.out.println("ArrayList: " + arrayList);

        //ensureCapacity
        arrayList.ensureCapacity(10);
        System.out.println("After ensuring capacity of 10: " + arrayList);
         
        //trimToSize
        arrayList.add("Additional Element");
        arrayList.trimToSize();
        System.out.println("After trimming to size: " + arrayList);
        
         

    }
}
//set store unique values and does not maintain the order of insertion(hashvalue)
//list store duplicate values and maintain the order of insertion
//dynamic in nature, can grow and shrink in size as needed
//allows duplicate elements
//maintains the order of insertion
//not synchronized, not thread-safe
//new capacity=old capacity+(old capacity/2)-->1.5times the old capacity when the current capacity is exceeded
//get ,set 0(1) time complexity, add and remove 0(n) time complexity in worst case when resizing is needed, otherwise O(1) for add at the end.
//random access is allowed, as it is based on an array structure.
//cache friendly, as it stores elements in contiguous memory locations.
//simple structure, easy to use and understand.