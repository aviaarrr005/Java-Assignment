import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();
        int index = marks / 10; 
        if (marks == 100) {
            index = 10;
        }

        switch (index) {
            case 10: 
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                if (marks >= 0 && marks < 60) {
                    System.out.println("Grade: F");
                } else {
                    System.out.println("Invalid Input");
                }
                break;
        }
        
        scanner.close();
    }
}