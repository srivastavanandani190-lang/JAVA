class basic{
    public static void main(String[] args) {
        int[] arr = new int[5];
        
        int x=101;
        for(int j=0; j<arr.length; j++){
            arr[j] = x;
            x++;
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
