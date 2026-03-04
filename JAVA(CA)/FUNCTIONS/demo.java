public class demo {
    public static void main(String[] args) {
    int x=sum(10,20);
    System.out.println("the sum is "+x);

    int y=sum(30,40,50);
    System.out.println("the sum is "+y);    
        float z=sum(5.5f,6.5f);
        System.out.println("the sum is "+z);
    }
 static int sum(int a,int b){
        int c=a+b;
        return c;
 }
 static float sum(float a,float b){
    float c=a+b;
    return c;}

static int sum(int x,int y,int z){
    int d=x+y+z;
    return d;
}
}
//functions overloading is the ability to create multiple 
// methods with the same name but different parameters. 
// It allows us to perform different operations based on
//  the number or type of arguments passed to the method. 
// In the above code, we have a method named "sum" 
// that takes two integer parameters and returns their sum. 
// We can create another method with the same name but different
//  parameters to perform a different operation, such as multiplying 
// two numbers or concatenating two strings.
