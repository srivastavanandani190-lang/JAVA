class continueodd
{
    public static void main(String args[])
    {
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
//labels in java-->used to identify a block of code and can be used with break and continue statements to control the flow of the program
//syntax of label-->labelName: statement
//example of label with break statement
//first:{
// second:{
//     System.out.println("Inside second block");  
//     break first;
//     }
// class labelbreak
// {
//     public static void main(String args[])
//     {
//         int i=1;
//         outer: while(i<=5)
//         {
//             int j=1;
//             while(j<=5)
//             {
//                 if(i==3 && j==3)
//                 {
//                     break outer;
//                 }
//                 System.out.println(i+" "+j);
//                 j++;
//             }
//             i++;
//         }
//     }
// }