public class array {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Print the elements of the array
        System.out.println("Array elements:");
         for (int num : numbers) {//for each loop
            System.out.println(num);
        }

        // Calculate and print the sum of the array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}