public class stringbuffer {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("honey");

        // Appending text to the StringBuffer
        sb.append(", World!");
        System.out.println("After append: " + sb.toString());
        System.out.println("HashCode: " + sb.hashCode());
        System.out.println("Capacity: " + sb.capacity());

        // Inserting text at a specific index
        sb.insert(5, " Beautiful");
        System.out.println("After insert: " + sb.toString());

        // Replacing text between two indices
        sb.replace(5, 15, " Amazing");
        System.out.println("After replace: " + sb.toString());

        // Deleting text between two indices
        sb.delete(5, 13);
        System.out.println("After delete: " + sb.toString());

        // Reversing the StringBuffer content
        sb.reverse();
        System.out.println("After reverse: " + sb.toString());

        // Getting the length of the StringBuffer
        int length = sb.length();
        System.out.println("Length of StringBuffer: " + length);

        //string buffer is safe for multithreading but string builder is not safe for multithreading because string buffer methods are synchronized.
    }
}