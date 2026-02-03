public class loops {
    public static void main(String[] args) {
        // Using a for loop to print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // Using a while loop to print numbers from 1 to 5
        int j = 1;
        while (j <= 5) {
            System.out.println("Number: " + j);
            j++;
        }

        // Using a do-while loop to print numbers from 1 to 5
        int k = 1;
        do {
            System.out.println("Number: " + k);
            k++;
        } while (k <= 5);

        //nested while loop
        int m = 1;
        while (m <= 3) {
            int n = 1;
            while (n <= 2) {
                System.out.println("m: " + m + ", n: " + n);
                n++;
            }
            m++;
        }
    }
}
