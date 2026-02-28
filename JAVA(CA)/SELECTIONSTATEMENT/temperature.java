class temperature{
    public static void main(String args[])
    {
        int temp=30;
        if(temp<=10)
        {
            System.out.println("It's a cold day.");
        }
        else if(temp>10 && temp<25)
        {
            System.out.println("It's a moderate day.");
        }
        else
        {
            System.out.println("It's hot.");
        }
    }
}