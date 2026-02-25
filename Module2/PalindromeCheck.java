
import java.util.Scanner;

public class PalindromeCheck {

    // Method to check if string is palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;               // Pointer starting at the beginning
        int right = str.length() - 1; // Pointer starting at the end

        // Loop until the pointers meet in the middle
        while (left < right) {
            // Compare characters at left and right pointers
            // We usually ignore case (A vs a) for palindromes
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If mismatch found, it's not a palindrome
            }
            left++;  // Move start pointer forward
            right--; // Move end pointer backward
        }
        return true; // If loop finishes without mismatch, it IS a palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to uppercase to make check case-insensitive
        if (isPalindrome(input.toUpperCase())) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}