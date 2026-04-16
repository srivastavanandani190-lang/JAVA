import java.util.*;
import java.util.stream.*;
public class demo2{
    public static void main(String[] args) {
        List< String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
  List<String> filternames = names.stream()
        .filter(name -> name.length() > 3)
        .map(name -> name.toUpperCase())
        .collect(Collectors.toList());
        System.out.println(filternames);
    }
}
//intermediate operations: filter, map
//terminal operations: collect, forEach, reduce, count, etc.