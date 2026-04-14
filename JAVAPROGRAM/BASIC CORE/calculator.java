class calculate{
    int x;
    public int add(int a, int b){
        x=a+b;
        return x;
    }
    public int add(int a, int b, int c){
        x=a+b+c;
        return x;
    }
}
//method overloading
public class calculator{
    public static void main(String[] args){
        int a=45;
        int b=85;
        calculate calc=new calculate();
        int result=calc.add(a,b);
        calculate calc1=new calculate();
        int result2=calc1.add(a,b,15);
        System.out.println("The sum is: "+result2);
        System.out.println("The sum is: "+result);
    }

    }
