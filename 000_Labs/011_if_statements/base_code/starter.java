import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();
        
        if (a != b) {
            System.out.println("The two integers are different.");
        } else {
            System.out.println("The two integers are the same.");
        }
        
        scanner.close();
    }
}
