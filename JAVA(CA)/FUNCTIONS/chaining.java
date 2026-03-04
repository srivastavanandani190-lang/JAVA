public class chaining {
    //global variable
    static int a=10;
    public static void main(String[] args) {
        //chaining functions in Java
        //we can call one function from another function in Java. 
        //scope of variables in Java is determined by the block in 
        // which they are declared.

       fun1();
       System.out.println(" bye");
       System.out.println(a);
    }
    static void fun1(){
         fun2();
        System.out.printf("everyone");
       
    }
    static void fun2(){
        fun3();
        System.out.printf("to java programming ");
    }
    static void fun3(){
        System.out.printf("Hello ");
    }
}
