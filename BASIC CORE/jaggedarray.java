public class jaggedarray {
    public static void main(String[] args) {
        // Declare and initialize a jagged array
        int jaggedArray[][] = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        // Print the elements of the jagged array
        System.out.println("Jagged Array elements:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // Creating a jagged array with different row sizes
        int jagged[][] = new int[3][];
        jagged[0] = new int[2]; // First row has 2 columns
        jagged[1] = new int[4]; // Second row has 4 columns
        jagged[2] = new int[3]; // Third row has 3 columns

        // Initializing the jagged array with random values
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = (int)(Math.random() * 10);
            }
        }

        // Printing the jagged array
        System.out.println("Jagged Array with random values:");
        for (int row[] : jagged) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
//disadvantages of arrays:
//1. Fixed Size: Once an array is created, its size cannot be changed. This can lead to wasted memory if the array is larger than needed or insufficient memory if the array is too small.
//2. Homogeneous Data: Arrays can only store elements of the same data type. This can be limiting when you need to store different types of data together.
//3. No Built-in Methods: Arrays do not have built-in methods for common operations like
//arr.length, sorting, or searching. You have to implement these functionalities manually, which can be time-consuming and error-prone.
//4. Inefficient Insertions and Deletions: Inserting or deleting elements in an array can be inefficient, especially if it requires shifting elements to maintain the order. This can lead to O(n) time complexity for these operations.
//5. Memory Management: In languages like C and C++, you need to manually manage memory for arrays, which can lead to issues like memory leaks or buffer overflows if not handled properly.
