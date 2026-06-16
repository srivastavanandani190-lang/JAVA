// creating a functional interface
@FunctionalInterface
interface Calculator{
    int calculate(int a,int b);
}
// class Addition implements Calculator{
//     @Override
//     public int calculate(int a,int b){
//         return a+b;
//     }
// }
public class demo0 {
    public static void main(String[] args) {
        // Calculator c=new Addition();//concrete class object

        // int result=c.calculate(10,20);
        // System.out.println("Addition: "+result);
        // print(10,20,c);
        //using lambda expression
        print(10,20,(a,b)->a*b);//lambda expression for multiplication
        Calculator c=(a,b)->a-b;//lambda expression for subtraction
        print(10,20,c);

    }
        public static void print(int a,int b,Calculator c){
            // int result=c.calculate(a,b);
            // System.out.println("Result: "+result);
            System.out.println("Result: "+c.calculate(a,b));
        }
}