class test{
    static int i;//static variable
    int j;//non-static variable
    static{
        i=10;
        System.out.println("Static block called. i = " + i);
    }    //static block 
}
public class gfg{
    public static void main(String args[]){
     System.out.println(test.i); //accessing static variable without creating object
    }
}