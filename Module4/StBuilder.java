// Write a program to reverse a string using StringBuilder.

public class StBuilder {
    public static void main(String[] args) {
        String original = "Hello World";
        StringBuilder sb = new StringBuilder(original);
        sb.reverse(); // Reverses the string
        String reversed = sb.toString();
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}