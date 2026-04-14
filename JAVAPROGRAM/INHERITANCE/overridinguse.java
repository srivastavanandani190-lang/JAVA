class A{
    public void show(){
        System.out.println("In A");
    }
    public int add(int a, int b){
        return a+b;
    }
}
class B extends A{
    // public void show(){
    //     System.out.println("In B");
    // }
    public int add(int a, int b){
        return a+b+10;
    }
}
public class overridinguse {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        System.out.println(obj.add(10, 20));
    }
}