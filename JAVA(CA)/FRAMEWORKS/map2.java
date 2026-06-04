import java.util.*;
public class map2{
    public static void main(String[] args) {
                //  Map<Integer,String> map = new HashMap<>();
                //  Map<Integer,String> map1 = new LinkedHashMap<>(100);
                //  Map<Integer,String> map2 = new LinkedHashMap<>(100,0.75f);
                //  Map<Integer,String> map3 = new LinkedHashMap<>(map2);
                    TreeMap<Integer,String> map4 = new TreeMap<>();
                    map4.put(1,"one");  
                    map4.put(2,"two");
                    map4.put(3,"three");
                    System.out.println(map4);
                    //first key
                    System.out.println(map4.firstKey());
                    //last key
                    System.out.println(map4.lastKey());
                    //first entry
                    System.out.println(map4.firstEntry());
                    //last entry
                    System.out.println(map4.lastEntry());
                    //head map
                    System.out.println(map4.headMap(3));
                    //tail map
                    System.out.println(map4.tailMap(2));
                    //sub map
                    System.out.println(map4.subMap(1, 3));
                    //sorted map
                    //lower key
                    System.out.println(map4.lowerKey(2));
                    //higher key
                    System.out.println(map4.higherKey(2));
                    //higher entry,lower entry,ceiling entry,floor entry
                    //descending map
                    System.out.println(map4.descendingMap());
                    //sub map
    }
}