import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        int fact=1;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find its factorial:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of "+n+" is: "+fact);

    }
}