class PaymentStatus {
    public static final int PENDING = 0;
    public static final int COMPLETED = 1;
    public static final int FAILED = 2;
}
public class demo {
    public static void main(String[] args) {
        int status = PaymentStatus.COMPLETED;
        if (status == PaymentStatus.COMPLETED) {
            System.out.println("Payment completed successfully.");
        } else if (status == PaymentStatus.PENDING) {
            System.out.println("Payment is pending.");
        } else if (status == PaymentStatus.FAILED) {
            System.out.println("Payment failed.");
        }
    }
}
//problems with this approach:
//1. Lack of type safety: The status variable can be assigned any integer value, which can lead to errors if an invalid value is used.
//2.poor readability: The code is less readable because the meaning of the integer values is not clear without referring to the PaymentStatus class.
//3.no grouping: The constants are not grouped together in a meaningful way, which can make it harder to understand the relationship between them.
