class add{
    int a,b;
    add(int x,int y){
        a=x;
        b=y;
    }
    void sum(){
        System.out.println("The sum is "+(a+b));
    }
}
public class basic {
    public static void main(String[] args) {
        add obj=new add(10,20);
        obj.sum();
    }
}
// fucntions are used to perform a specific task and can be called multiple times in a program.  
// functions increases the reusability of code and make it more organized. 
// We can create multiple objects of the class "add" and call the sum() function
// to perform the addition operation with different values of a and b.