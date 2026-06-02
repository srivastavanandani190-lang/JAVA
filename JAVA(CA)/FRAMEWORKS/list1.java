import java.util.*;
public class list1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("List");

        //get(int index)
        System.out.println("Element at index 2: " + list.get(2));

        //set(int index, E element)
        list.set(2, "Updated Java");
        System.out.println("After updating index 2: " + list);

        //add(int index, E element)
        list.add(1, "Inserted Element");
        System.out.println("After inserting at index 1: " + list);

        //addAll(int index, Collection<? extends E> c)
        List<String> anotherList = Arrays.asList("Another", "List");
        list.addAll(3, anotherList);
        System.out.println("After adding another list at index 3: " + list);

        //remove(int index)
        String removedElement = list.remove(4);
        System.out.println("Removed element at index 4: " + removedElement);

        //indexOf(Object o)
        int index = list.indexOf("World");
        System.out.println("Index of 'World': " + index);

        //lastIndexOf(Object o)
        list.add("Hello");
        int lastIndex = list.lastIndexOf("Hello");
        System.out.println("Last index of 'Hello': " + lastIndex);

        //listIterator()
        ListIterator<String> iterator = list.listIterator();    
        System.out.println("Iterating through the list:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
 
        //listIterator(int index)
        ListIterator<String> iteratorFromIndex = list.listIterator(2);
        System.out.println("Iterating from index 2:");
        while (iteratorFromIndex.hasNext()) {
            System.out.println(iteratorFromIndex.next());
        }

        //of->Java 9 introduced the List.of() method to create immutable lists.
        //This method takes a variable number of arguments and returns an unmodifiable list containing those elements.
        List<String> ofList = List.of("Immutable", "List", "Example");
        System.out.println("Of List: " + ofList);

            //copyOf
        List<String> copyOfList = List.copyOf(list);
        System.out.println("Copy of List: " + copyOfList);

    }
}