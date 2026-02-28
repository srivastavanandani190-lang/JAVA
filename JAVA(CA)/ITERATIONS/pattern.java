class pattern
{
    public static void main(String[] args)
    {
        int n=5;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=n-i+1;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        //* * * * * 
        //* * * *
        //* * *
        //* *
        //* 
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=n;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *

    }
}
//jump statements-->break, continue, return
//break-->used to exit from loop or switch case
//continue-->used to skip the current iteration of loop and move to next iteration
//return-->used to exit from method and return a value if method is not void
//scope of variable in loop-->variable declared in loop is local to that loop and cannot be accessed outside the loop