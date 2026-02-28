class simplecalculator{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        char operator='*';
        switch(operator){
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            default:
            System.out.println("invalid operator");
        }
    }
}