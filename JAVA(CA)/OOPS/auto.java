//why one public class in a file -->so that we can easily identify the main class and avoid confusion
//if we have multiple public classes in a file then we have to identify the main class by looking at the file name and it can be confusing if we have multiple classes in a file
//why name of the file should be same as the name of the public class -->so that we can easily identify the main class and avoid confusion
//all for jvm to identify the main class and execute-->demo.java-->demo.main() .


//autoboxing-->automatic conversion of primitive data types to their corresponding wrapper classes and vice versa.
//unboxing-->automatic conversion of wrapper classes to their corresponding primitive data types.
//wrapper classes-->Integer, Double, Float, Long, Short, Byte, Character, Boolean is used to convert primitive data types to objects and vice versa. 
// They are used when we need to use primitive data types as objects, such as in collections or when we need to use methods that require objects.
//collection framework work on objects not on primitive data types so we need to use wrapper classes to store primitive data types in collections.
//why primitive exist-->for performance reasons, primitive data types are faster,legacy,memory efficient.


class auto{
    public static void main(String[] args) {
        //autoboxing
        int a=10;
        Integer b=a;//autoboxing
//internally jvm will convert int a to Integer b by creating an object of Integer class and storing the value of a in it and then assigning it to b.
//Interger b=Integer.valueOf(a);-->this is how jvm will convert int a to Integer b internally. new method
//Integer b=new Integer(a);-->this is how jvm will convert int a to Integer b internally. old method


        System.out.println("Autoboxing: "+b);
        //unboxing
        Integer c=20;
        int d=c;//unboxing
        //int d=c.intValue();-->this is how jvm will convert Integer c to int d internally. new method
        //int d=c;-->this is how jvm will convert Integer c to int d internally. old method

        System.out.println("Unboxing: "+d);
        //method calls
        int x=50;
        printInteger(x);


     Integer n=5;
     Integer m=6;
     int sum=n+m;
     System.out.println("Sum: "+sum);


    }
    static void printInteger(Integer i){
        System.out.println("Integer value: "+i);
    }
}
//assignment
//method calls
//arithmetic operations 

