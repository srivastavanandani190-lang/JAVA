class array{
    public static void main(String[] args) {
         //2d array
         int[][] arr = new int[3][3];
         //without heap 
         int[][] arr2 = {{1,2,3}, {4,5,6}, {7,8,9}};
         for(int i=0; i<arr2.length; i++){
             for(int j=0; j<arr2[i].length; j++){
                 System.out.print(arr2[i][j] + " ");
             }
             System.out.println();
         }
         
         int count = 1;
         for(int i=0; i<arr.length; i++){
             for(int j=0; j<arr[i].length; j++){
                 arr[i][j] = count;
                 count++;
             }
         }
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
    }
}