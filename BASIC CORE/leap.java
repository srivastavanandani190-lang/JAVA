public class leap {
    public static void main(String[] args) {
        int year = 2028; // You can change this value to test with other years
        boolean isLeap = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
        }
        else{
            isLeap = false;
        }
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}