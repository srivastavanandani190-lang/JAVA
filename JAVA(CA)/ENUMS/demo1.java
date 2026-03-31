//enum-->Enumeration-->A group of named constants-->enumerated type
//enum is a special data type that enables for a variable to be a set of predefined constants
//introduced in java 5.0
enum PaymentStatus{
    PENDING,COMPLETED,FAILED
}
public class demo1 {
    public static void main(String[] args) {
        PaymentStatus status=PaymentStatus.COMPLETED;
        System.out.println("Payment Status: "+status);
    }
}

