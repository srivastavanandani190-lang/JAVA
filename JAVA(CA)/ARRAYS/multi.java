class multi{
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        //rows can have different number of columns
        //number of columns can be decided at runtime
        //number of rows is fixed but number of columns can be different for each row
        
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];
        int count = 1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = count;
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
 //2d array with different number of columns in each row is called jagged array
 //jagged array is an array of arrays
 //2d array is used to store data in tabular form
 // 2d array is used to store data in matrix form
    }
}
