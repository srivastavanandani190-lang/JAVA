class mobile{
    String brand;
    int price;
    static String name;
    public mobile(){
        brand = "unknown";
        price = 0;
        System.out.println("constructor is called");
    }
    static {
        name = "samsung";
        System.out.println("static block is called");
    }
}
//all classes are loaded from library to classloader
//static block is called when class is loaded by classloader
//if no object no static block is called.
public class staticblock{
    public static void main(String[] args) {
        // mobile.name="samsung";
        mobile m1=new mobile();
        m1.brand="galaxy";
        m1.price=20000;

        mobile m2=new mobile();
        m2.brand="note";
        m2.price=30000;
        //call static block only once

        mobile m3=new mobile();
        m3.brand="a series";    
        m3.price=15000;

        System.out.println("mobile 1: "+m1.brand+" "+m1.price+" "+mobile.name);
        System.out.println("mobile 2: "+m2.brand+" "+m2.price+" "+mobile.name);
        System.out.println("mobile 3: "+m3.brand+" "+m3.price+" "+mobile.name);

        
    }
}