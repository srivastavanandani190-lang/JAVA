class operator{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Arithmetic Operators->+, -, *, /, %,++,--,+=, -=, *=, /=, %=
        System.out.println("Addition: " + (a + b)); // 30
        System.out.println("Subtraction: " + (a - b)); // -10
        System.out.println("Multiplication: " + (a * b)); // 200
        System.out.println("Division: " + (b / a)); // 2
        System.out.println("Modulus: " + (b % a)); // 0
        int i=4;
        System.out.println("Post-increment: " + (i++)); // 4, then i becomes 5
        System.out.println("Pre-increment: " + (++i)); // 6

        i--;
        System.out.println("Post-decrement: " + (i--)); // 6, then i becomes 5
        System.out.println("Pre-decrement: " + (--i)); // 4



        // Relational Operators
        System.out.println("Is a equal to b? " + (a == b)); // false
        System.out.println("Is a not equal to b? " + (a != b)); // true
        System.out.println("Is a greater than b? " + (a > b)); // false
        System.out.println("Is a less than b? " + (a < b)); // true

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false

        // Assignment Operators
        int c = a; // c is now 10
        c += 5; // c is now 15
        System.out.println("c after addition assignment: " + c); // 15

        c -= 3; // c is now 12
        System.out.println("c after subtraction assignment: " + c); // 12

        c *= 2; // c is now 24
        System.out.println("c after multiplication assignment: " + c); // 24

        c /= 4; // c is now 6
        System.out.println("c after division assignment: " + c); // 6

        c %= 4; // c is now 2
        System.out.println("c after modulus assignment: " + c); // 2

        //bitwise operators
        int p = 5; // 0101 in binary
        int q = 3; // 0011 in binary
        System.out.println("Bitwise AND: " + (p & q)); // 1
        System.out.println("Bitwise OR: " + (p | q)); // 7
        System.out.println("Bitwise XOR: " + (p ^ q)); // 6
        System.out.println("Bitwise NOT: " + (~p)); // -6
        System.out.println("Left Shift: " + (p << 1)); // 10
        System.out.println("Right Shift: " + (p >> 1)); // 2
        System.out.println("Unsigned Right Shift: " + (p >>> 1)); // 2
        int r = 1; // 0001 in binary
        r=r<<33; // Left shift by 33 is equivalent to left shift by 1 (33 % 32)
        System.out.println("Left Shift by 33: " + r); // 2
        int q1=1;
        q1=q1>>33; // Right shift by 33 is equivalent to right shift by 1 (33 % 32)
        System.out.println("Right Shift by 33: " + q1); // 0
        byte h=1;
        h=(byte)(h<<33); // Left shift by 33 is equivalent to left shift by 1 (33 % 8)
        System.out.println("Left Shift by 33 on byte: " + h); // 2
   }
}