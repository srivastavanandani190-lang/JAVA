import java.util.*;
public class set {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Nandani");
        mySet.add("Nilakshi");
        mySet.add("Navya"); // Duplicate, will not be added

        System.out.println("Set contains: " + mySet);
        System.out.println("Size of set: " + mySet.size());
        System.out.println("Does the set contain 'Nandani'? " + mySet.contains("Nandani"));


        
    }
}
//set stores unique elements and does not maintain any order. 
//In this example, we use a HashSet which is a common implementation of the Set interface in Java. 
//When we try to add "Hello" twice, it will only be stored once in the set, demonstrating that sets do not allow duplicate elements.
//constant time complexity for basic operations like add, remove, and contains.
