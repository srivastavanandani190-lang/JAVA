public class demo3{
    public static void main(String[] args) {
       Integer y=getResult(10);
       System.out.println(y);
         getResult2("hello", 100);

    }
    public static <T> T getResult(T t){
        return t;   
    }   

    public static <T, U> void getResult2(T t, U u){
        System.out.println(u+","+t);
     
    }
}