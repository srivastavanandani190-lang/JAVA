public class basic {
    public static void main(String[] args) {
        int result = sum(10,20);
        System.out.println("The sum is: " + result);
        greet();
        int randomNumber = getRandomNumber();
        System.out.println("Random number: " + randomNumber);
        printSum(5, 7);

    }

    //no input and no output function
static void greet(){
    System.out.println("hello world");
    //return ; optional in void function
}

//no input and some output function
static int getRandomNumber(){
    return (int)(Math.random()*100);
}

//some input and no output function
static void printSum(int a,int b){//Number of parameters can be zero or more than zero
    int c=a+b;
    System.out.println("the sum is "+c);
}

//some input and some output function
 static int sum(int a,int b){
        int c=a+b;
        return c;
    }
}
// fucntions are used to perform a specific task and can be called multiple times in a program.  
// functions increases the reusability of code and make it more organized. 