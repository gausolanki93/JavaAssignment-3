// Write a program which returns the length of a string (without length method)
public class String4 {
    public static void main(String[] args) {
        String input = "Hello, world!";
        int length = calculateLength(input);
        System.out.println("Length of the string: " + length);
    }
    
    public static int calculateLength(String str) {
        int count = 0;
        char[] charArray = str.toCharArray();
        
        for (char c : charArray) {
            count++;
        }
        
        return count;
    }
}