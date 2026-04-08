public class demo0 {
    public static void main(String[] args) {
        Box b = new Box(10);
        Box b1 = new Box("Hello");
        Box b2 = new Box(10.5);

        System.out.println(b.get());
        System.out.println(b1.get());
        System.out.println(b2.get());
 
        Integer i = (Integer) b.get();   // safe
        String s = (String) b1.get();    // safe

        System.out.println(i+85);
        System.out.println(s.concat(" World"));
 
    }
}

class Box {
    private Object value;

    // Constructor
    Box(Object value) {
        this.value = value;
    }

    // Setter
    public void set(Object value) {
        this.value = value;
    }

    // Getter
    public Object get() {
        return value;
    }
}
//generics solve the problem of type safety and eliminate the need for type casting.
//With generics, you can specify the type of objects that a class or method can work with, ensuring that only compatible types are used and reducing the risk of runtime errors.