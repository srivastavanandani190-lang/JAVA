//call by  value
public class demo2{
    public static void main(String[] args){
        int x=4;
        int y=5;
        System.out.println("x:"+x+" y:"+y);
        addTen(x,y);
        System.out.println("x:"+x+" y:"+y);

    }
    public static void addTen(int a,int b){
        a=a+10;
        b=b+10;
    }
}