class A{
    A(){
        System.out.println("Constructor of class A");
    }
    A(int x){
        System.out.println("Constructor of class A with parameter: " + x);
    }
}
class B extends A{
    B(){
        //super(); // This is called implicitly if not written
        System.out.println("Constructor of class B");
    }
    B(int x){
        super(x); // Calls the constructor of class A with parameter
        System.out.println("Constructor of class B with parameter: " + x);
    }
}
public class thisvssuper {
    public static void main(String[] args) {
        B obj1 = new B();
        B obj2 = new B(10);
    }
}

