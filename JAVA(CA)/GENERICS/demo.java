public class demo {
    public static void main(String[] args) {
        //Upcasting
    String s="Hello";
    Object obj=s;
    System.out.println(obj);//specific to generics, it will call toString() method of String class and print the value of s which is "Hello"

    //Downcasting
    Object o="World";
    String str=(String)o;
    System.out.println(str);//generic to specific, it will call toString() method of String class and print the value of o which is "World"

     
    Object o1=100;
    String str1=(String)o1;//it will throw ClassCastException because we are trying to cast an Integer object to a String object which is not possible
    System.out.println(str1);



    }
}
//errors-->1.compiletime error-->better
//2.Runtime error

