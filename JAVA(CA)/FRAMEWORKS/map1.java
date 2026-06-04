import java.util.*;
public class map1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        System.out.println("Map: " + map);
        System.out.println("Value for 'banana': " + map.get("banana"));
        System.out.println("Contains key 'apple': " + map.containsKey("apple"));
        System.out.println("Contains value 3: " + map.containsValue(3));
        map.remove("orange");
        System.out.println("Map after removing 'orange': " + map);

//putAll() method
        HashMap<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("grape", 4);
        anotherMap.put("melon", 5);
        map.putAll(anotherMap);
        System.out.println("Map after putAll: " + map);
        // map.clear();
        System.out.println("Map after clear: " + map);

        Set<String> keys = anotherMap.keySet();
        System.out.println("Keys: " + keys);
        Collection<Integer> values = anotherMap.values();
        System.out.println("Values: " + values);
        Set<Map.Entry<String, Integer>> entries = anotherMap.entrySet();
        System.out.println("Entries: " + entries);

        //getOrDefault() method
        int value = map.getOrDefault("peach", 0);
        System.out.println("Value for 'peach' (default 0): " + value);
         
         //putIfAbsent() method
        map.putIfAbsent("banana", 10);  
        map.putIfAbsent("peach", 10);
        System.out.println("Map after putIfAbsent: " + map);
        map.replace("banana", 10, 20);//just update the value of banana
        System.out.println("Map after replace: " + map);

        Map<String, Integer> unmodifiableMap = Map.of("kiwi", 6, "pear", 7);
        System.out.println("Unmodifiable Map: " + unmodifiableMap);

    }
}