class exception{
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // This will throw an ArithmeticException

            int arr[] = new int[5];
            arr[10] = 50; // This will throw an ArrayIndexOutOfBounds

            String str = null;
            System.out.println(str.length()); // This will throw a NullPointerException
            
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}
//runtime error in java is called exception. 
// It is an event that occurs during the execution of a program that disrupts the normal flow of instructions. 
// Exceptions can be caused by various factors, such as invalid user input, file not found, or division by zero. 
// In Java, exceptions are handled using try-catch blocks, allowing developers to gracefully handle errors and maintain the stability of the application.