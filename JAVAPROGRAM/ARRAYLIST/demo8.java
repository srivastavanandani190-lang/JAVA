import java.util.*;
public class demo8 {
    public static void main(String[] args) {
         HashMap<String, String> map = new HashMap<>();
         map.put("name", "Alice");  
         map.put("age", "30");
        map.put("city", "New York");
        System.out.println("Value for key 'name': " + map.get("name"));
        System.out.println("Value for key 'age': " + map.get("age"));
        System.out.println("Value for key 'city': " + map.get("city"));
        
    }
}