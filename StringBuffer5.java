// Convert a string created with StringBuffer to immutable string.
public class StringBuffer5 {

    public static void main(String[] args) {
        // Create a mutable StringBuffer
        StringBuffer mutableStringBuffer = new StringBuffer("This is a mutable StringBuffer.");

        // Convert to an immutable String
        String immutableString = mutableStringBuffer.toString();

        // Print the immutable string
        System.out.println(immutableString);
    }
}
