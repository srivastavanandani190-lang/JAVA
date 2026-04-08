//generics
 
public class demo1 {
    public static void main(String[] args) {
        //creating a generic class object
        MyClass<Integer> obj = new MyClass<>(10);
        System.out.println("Value: " + (obj.getValue()+70));
        
        MyClass<String> obj2 = new MyClass<>("Hello");
        System.out.println("Value: " + obj2.getValue());


        Double d=(double)obj.getValue();
        System.out.println("Value: " + d);//parent-child relation is allowed in generics but not sibling relation

        



    }
}
class MyClass<T> {
    private T value;
    
    public MyClass(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return value;
    }
}
