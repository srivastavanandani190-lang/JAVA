import Mathematics.Matrix;

public class Main {
    public static void main(String[] args) {

        Matrix m = new Matrix();

        int[][] A = {
            {1, 2},
            {3, 4}
        };

        int[][] B = {
            {5, 6},
            {7, 8}
        };

        System.out.println("Matrix A:");
        m.display(A);

        System.out.println("Matrix B:");
        m.display(B);

        int[][] sum = m.add(A, B);
        System.out.println("Addition:");
        m.display(sum);

        int[][] diff = m.subtract(A, B);
        System.out.println("Subtraction:");
        m.display(diff);
    }
}