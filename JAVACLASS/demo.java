class Calculator{
    int add(int a,int b){
        return a+b;
    }
    float add(float a,float b){
        return a+b;
    }
}
public class demo{
    public static void main(String args[]){
        Calculator obj1=new Calculator();
        Calculator obj2=new Calculator();
        System.out.println("Integer Addition:"+obj1.add(5,8));
        System.out.println("float Addition:"+obj2.add(5.2f,8.6f));
    }
}