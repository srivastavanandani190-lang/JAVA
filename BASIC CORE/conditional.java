public class conditional {
    public static void main(String[] args) {
        int number = 10;

        // Using if-else statement
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
        int a=5, b=20, c=15;
        if(a>=b && a>=c){
            System.out.println(a+" is the largest number.");
        } 
        else if(b>=a && b>=c){
            System.out.println(b+" is the largest number.");
        } 
        else {
            System.out.println(c+" is the largest number.");    
        }

        // Using switch statement
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("The day is: " + dayName);
    }
}