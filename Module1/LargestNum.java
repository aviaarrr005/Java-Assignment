import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest number.");
        } 
        else if (b >= a && b >= c) {
            System.out.println(b + " is the largest number.");
        } 
        else {
            System.out.println(c + " is the largest number.");
        }
        
        scanner.close();
    }
}