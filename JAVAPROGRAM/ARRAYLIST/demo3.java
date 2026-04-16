import java.util.*;
public class demo3{
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        Optional<String> longestName = Arrays.stream(names)
        .reduce((name1, name2) -> name1.length() > name2.length() ? name1 : name2);
        if(longestName.isPresent()){
            System.out.println("Longest name: " + longestName.get());
        } else {
            System.out.println("No names found.");
        }   
    }
}