import java.util.*;
public class collection1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Collection");
        System.out.println("ArrayList: " + list);

         int n = list.size();
        System.out.println("Size of ArrayList: " + n);

        //boolean remove(Object o)
        boolean isRemoved = list.remove("Java");
        System.out.println("After removing 'Java': " + list);
        System.out.println("Was 'Java' removed? " + isRemoved);

        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

         boolean containsHello = list.contains("Hello");
        System.out.println("Contains 'Hello': " + containsHello);   

        //void clear()
        list.clear();
        System.out.println("After clearing the list: " + list);

        //Object[] toArray()
        list.add("New");
        list.add("Elements");
        Object[] array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        //T[] toArray(T[] a)
        String[] strArray = list.toArray(new String[0]);
        System.out.println("String Array: " + Arrays.toString(strArray));

       //boolean add(E e)
        boolean isAdded = list.add("Another");
        System.out.println("After adding 'Another': " + list);
        System.out.println("Was 'Another' added? " + isAdded);
       //in case of hashset duplicate elements will not be added and it will return false
        HashSet<String> set = new HashSet<>();
        boolean isAddedSet1 = set.add("Hello");
        boolean isAddedSet2 = set.add("Hello"); // Duplicate
        System.out.println("HashSet: " + set);
        System.out.println("Was 'Hello' added the first time? " + isAddedSet1);
        System.out.println("Was 'Hello' added the second time? " + isAddedSet2);
      
         //boolean addAll(Collection<? extends E> c)
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println("List2 after addAll: " + list2);

         //boolean containsAll(Collection<?> c)
        boolean containsAll = list2.containsAll(list);
        System.out.println("List2 contains all elements of List: " + containsAll);

         //boolean removeAll(Collection<?> c)
        boolean isRemovedAll = list2.removeAll(list);
        System.out.println("List2 after removeAll: " + list2);
        list.removeAll(List.of("New", "Elements")); // Clear list for next test


        //boolean retainAll(Collection<?> c)
        list2.addAll(list);
        boolean isRetainedAll = list2.retainAll(list);
        System.out.println("List2 after retainAll: " + list2);

        //equlas, hashcode, toString, iterator, listIterator, spliterator, stream, parallelStream, forEach are some of the commonly used methods in Java Collections Framework are overridden in collection classes and can be used to perform various operations on collections.
     
    }
}
//add ,remove, clear, contains, size, isEmpty, toArray, addAll, containsAll, removeAll, retainAll are some of the commonly used methods in Java Collections Framework.