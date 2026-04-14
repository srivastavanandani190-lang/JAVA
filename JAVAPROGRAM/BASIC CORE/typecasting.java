public class typecasting{
public static void main(String[] args) {
    // Implicit Typecasting
    int intVar = 100;
    double doubleVar = intVar; // int to double
    System.out.println("Implicit Typecasting:");
    System.out.println("Integer value: " + intVar);
    System.out.println("Converted to Double: " + doubleVar);
    // Explicit Typecasting
    double anotherDoubleVar = 9.78;
    int anotherIntVar = (int) anotherDoubleVar; // double to int
    System.out.println("Explicit Typecasting:");
    System.out.println("Double value: " + anotherDoubleVar);  
    System.out.println("Converted to Integer: " + anotherIntVar);
    
    int a=257;
    byte b=(byte)(a);
    System.out.println(b);
    byte c=40;
    byte d=50;
    int c1=c*d;
    System.out.println(c1);
   
   int num=0b10;
  System.out.println(num);
   int num2=0x2A;
  System.out.println(num2);
  int num3=1000_000;
  System.out.println(num3);
  float num4=12e10f;
    System.out.println(num4);

    char ch='A';
    ch++;
    System.out.println(ch);
    ch+=2;
    System.out.println(ch);
}
}
