import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop 1: Print spaces
            // Spaces decrease as we move down (rows - i)
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Inner loop 2: Print stars
            // Stars increase by 2 each row (2*i - 1)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after printing spaces and stars
            System.out.println();
        }
        
        scanner.close();
    }
}