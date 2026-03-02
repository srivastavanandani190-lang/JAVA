class threed{
    public static void main(String[] args) {
        int[][][] arr = new int[3][3][3];
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                for(int k=0; k<arr[i][j].length; k++){
                    arr[i][j][k] = count;
                    count++;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                for(int k=0; k<arr[i][j].length; k++){
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    //3d arrays are arrays of 2d arrays. 
    // They are used to store data in a 3d format.
    //  They are also called as multi-dimensional arrays.
    //  They are used in various applications like image processing, scientific computing, etc.
}