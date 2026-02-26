class typecasting {
    public static void main(String[] args) {
        // Implicit type casting (widening)
        byte num1 = 10;
        int num2 = num1; // byte to int
        System.out.println("Implicit type casting: " + num2); // Output: 10 

        // Explicit type casting (narrowing)
        double num3 = 9.99;
        int num4 = (int) num3; // double to int
        System.out.println("Explicit type casting: " + num4); // Output: 9

       char letter = 'A';
       int asciiValue = letter; // char to int (implicit)
       System.out.println("ASCII value of '" + letter + "': " + asciiValue);


        //truncating casting
        float num5 = 3.14f;
        int num6 = (int) num5; // float to int
        System.out.println("Truncating type casting: " + num6); // Output: 3
 
    byte b=50;
    b=(byte)(b*5); // byte to int and back to byte
    System.out.println(b);

    int a=300;
    byte c=(byte)a; // int to byte (explicit)
    System.out.println(c); // Output: 44 (due to overflow)

    }
}