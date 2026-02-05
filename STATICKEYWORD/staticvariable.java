class mobile{
    String brand;
    int price;
    static String name="samsung";
    public void show(){
        System.out.println(brand+" "+price+" "+name);
    }
}
public class staticvariable{
    public static void main(String[] args) {
        // mobile.name="samsung";
        mobile m1=new mobile();
        m1.brand="galaxy";
        m1.price=20000;
        m1.show();

        mobile m2=new mobile();
        m2.brand="note";
        m2.price=30000;
        m2.show();
    }
}