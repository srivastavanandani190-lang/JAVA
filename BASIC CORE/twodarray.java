public class twodarray {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the elements of the 2D array
        System.out.println("2D Array elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int nums[][] = new int[3][3]; //declaration and instantiation of 2D array
        // nums[0][0]=1;initialization
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                nums[i][j]=(int)(Math.random()*10);
            }}
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }
      for(int row[]:nums){
        for(int element:row){
            System.out.print(element+" ");
        }
        System.out.println();
      }

  }
}