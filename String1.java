// Create a character array consisting of your name and convert that into a string and print the same.
public class String1 {
    public static void main(String[] args) {
        char[] charArray = {'C', 'h', 'a', 't', 'G', 'P', 'T'};
        
        // Convert character array to string
        String name = new String(charArray);
        
        System.out.println("Character Array: " + charArray);
        System.out.println("Converted String: " + name);
    }
}