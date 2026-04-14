import java.util.Scanner;

class addition{
    public static void main(String[] args){
        //addition of two matrices taking input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        Scanner colsScanner = new Scanner(System.in);
        System.out.print("Enter the number of columns: ");
        int cols = colsScanner.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = colsScanner.nextInt();
            }
        }
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The sum of the two matrices is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}
// Write a Java program to create a Student class, initialize student details using a parameterized constructor, and display the student information using class objects and member functions.
// Write a Java program to create a BankAccount class using encapsulation (private data members) and perform operations such as deposit, withdraw, and display balance using menu-driven choices.
