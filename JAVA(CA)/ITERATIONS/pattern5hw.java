class pattern5hw{
    public static void main(String[] args) {
        int n = 5; // Number of rows
         //   *
         //  * *
         // * * *
        // * * * *
        // * * * * *
        for (int i = 0; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= n-i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}