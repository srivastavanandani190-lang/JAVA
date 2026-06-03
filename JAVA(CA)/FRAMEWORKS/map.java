import java.util.*;
public class map {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Nandani", 25);
        myMap.put("Nilakshi", 30);
        myMap.put("Navya", 28);
        System.out.println("Map contains: " + myMap);
        System.out.println("Size of map: " + myMap.size());
        System.out.println("Age of Nandani: " + myMap.get("Nandani"));
        System.out.println("Does the map contain 'Nilakshi'? " + myMap.containsKey("Nilakshi"));
    }
}
//map stores key-value pairs and does not maintain any order.
//In this example, we use a HashMap which is a common implementation of the Map interface in Java.
//When we add key-value pairs to the map, each key is unique and maps to a
//specific value. If we try to add a key that already exists, it will overwrite the existing value.
//constant time complexity for basic operations like put, get, and containsKey.