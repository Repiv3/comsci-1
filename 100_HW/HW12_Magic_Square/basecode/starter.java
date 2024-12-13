import pkg.*;
import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of special squares to find: ");
        int n = scanner.nextInt();
        findSpecialSquares(n);
    }

    public static void findSpecialSquares(int n) {
        int count = 0;
        int number = 1;

        while (count < n) {
            int square = number * number;
            if (isSumOfConsecutive(square)) {
                System.out.println(square + " is a special square (" + number + "*" + number + ")");
                count++;
            }
            number++;
        }
    }

    public static boolean isSumOfConsecutive(int num) {
        int sum = 0;
        int i = 1;

        while (sum < num) {
            sum += i;
            if (sum == num) {
                return true;
            }
            i++;
        }
        return false;
    }
}
