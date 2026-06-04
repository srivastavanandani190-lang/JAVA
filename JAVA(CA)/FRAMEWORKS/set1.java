import java.util.*;
public class set1 {
    public static void main(String[] args) {
       TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(3);
        set.add(8);
        set.add(1);
        set.add(6);
        System.out.println("The elements in the TreeSet are: " + set);
        System.out.println("The first element in the TreeSet is: " + set.first());
        System.out.println("The last element in the TreeSet is: " + set.last());

        System.out.println("The elements in the TreeSet in descending order are: " + set.descendingSet());
        System.out.println("The number of elements in the TreeSet is: " + set.size());

        System.out.println("The elements in the TreeSet less than 5 are: " + set.headSet(5));
        System.out.println("The elements in the TreeSet greater than or equal to 5 are: " + set.tailSet(5));
        //subset
        System.out.println("The elements in the TreeSet between 3 and 6 are: " + set.subSet(3, 6));
        //from element is inclusive and to element is exclusive
        
        //lower and floor
        System.out.println("The greatest element in the TreeSet less than 5 is: " + set.lower(5));
        System.out.println("The greatest element in the TreeSet less than or equal to 5  is: " + set.floor(5));

      //higher and ceiling
        System.out.println("The least element in the TreeSet greater than 5 is: " + set.higher(8));
        System.out.println("The least element in the TreeSet greater than or equal to 5 is: " + set.ceiling(8));

    //pollfirst and polllast
        System.out.println("The first element in the TreeSet is: " + set.pollFirst());
        System.out.println("The last element in the TreeSet is: " + set.pollLast());

    System.out.println("The elements in the TreeSet are: " + set);

    Iterator<Integer> it=set.descendingIterator();
    System.out.println("The elements in the TreeSet in descending order are: ");
    while(it.hasNext()){
        System.out.print(it.next() + " ");
    }
    }
}
//BST-->