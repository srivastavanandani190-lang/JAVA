import java.util.*;
public class iterator2 {
    public static void main(String[] args) {
       String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        NameContainer nameContainer = new NameContainer(names);
        for (String name : nameContainer) {
            System.out.println(name);
        }
        Iterator<String> it = nameContainer.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
class NameContainer implements Iterable<String>{
    private String[] names;
    private int size;

     NameContainer(String[] names) {
        this.names = names;
        this.size = this.names.length;
    }
    @Override
    public Iterator<String> iterator() {
        return  new  NameContainerIterator();
    }
    private class NameContainerIterator implements Iterator<String>{
        private int pos=0;

        @Override
        public boolean hasNext() {
            return pos < size;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return names[pos++];
        }
    }
}